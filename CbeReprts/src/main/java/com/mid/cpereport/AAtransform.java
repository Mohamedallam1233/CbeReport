package com.mid.cpereport;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.w3c.dom.Document;
public class AAtransform implements Processor {
	@Override
	public void process(Exchange exchange) throws Exception {
		Properties properties = new Properties();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream inputStream = classloader.getResourceAsStream("application.properties");
		properties.load(inputStream);
		String actualMsg = exchange.getIn().getBody(String.class);
		final String camelFileName = exchange.getIn().getHeader("CamelFileName").toString();
		System.setProperty("fileName", camelFileName);
		System.out.println(actualMsg);	
		String[] lines;
		lines = actualMsg.split("\\n");
		int linesSize = lines.length;
		try {
			if (linesSize > 0) {
		        AAheader header = new AAheader();
		        header.setLine(lines[0]);
				Document headerDoc = header.getHeaderAsXmlDocument();   
		        ArrayList<Document> accounts = new ArrayList<>();
				for (int i = 1; i < linesSize; i++) {
						AArecord aaReacord=new AArecord();
						aaReacord.setLine(lines[i]);;
						Document recordDoc = aaReacord.getRecordAsXmlDocument();
						accounts.add(recordDoc);
				}
				String finalresult = XmlHandle.getStringFromXml("documents", "accounts", headerDoc, accounts, true);
				finalresult = finalresult.replace("&#13;", "");
				exchange.getIn().setBody( finalresult );
			}
		}
		catch(Exception e)
		{
			
		}
	}

}