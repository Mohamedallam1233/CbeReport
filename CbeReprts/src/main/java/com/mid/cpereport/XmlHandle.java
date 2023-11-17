package com.mid.cpereport;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
public class XmlHandle {
    public static String getStringFromXml(String documentTag, String innerTagName, Document headerDoclist, ArrayList<Document> bodyList, boolean createInnerTag) {
        try {
            Document mainDoc = createMainDocument(documentTag, headerDoclist, bodyList, createInnerTag ? innerTagName : null);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            transformer.transform(new DOMSource(mainDoc), result);
            return writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private static Document createMainDocument(String tagName, Document headerDoc, ArrayList<Document> accounts, String innerTagName) {
        try {
            Document mainDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = mainDoc.createElement(tagName);
            mainDoc.appendChild(rootElement);

            Element importedHeader = (Element) mainDoc.importNode(headerDoc.getDocumentElement(), true);
            rootElement.appendChild(importedHeader);

            if (innerTagName != null) {
                Element accountsElement = mainDoc.createElement(innerTagName);
                rootElement.appendChild(accountsElement);

                for (Document document : accounts) {
                    Element importedRecord = (Element) mainDoc.importNode(document.getDocumentElement(), true);
                    accountsElement.appendChild(importedRecord);
                }
            } else {
                for (Document document : accounts) {
                    Element importedRecord = (Element) mainDoc.importNode(document.getDocumentElement(), true);
                    rootElement.appendChild(importedRecord);
                }
            }
            return mainDoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static Document createXmlDocument(String tagName, Map<String, String> elements) {
        try {
            Document mainDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = mainDoc.createElement(tagName);
            mainDoc.appendChild(rootElement);

            for (Map.Entry<String, String> entry : elements.entrySet()) {
                String elementName = entry.getKey();
                String elementValue = entry.getValue();
                rootElement.appendChild(createElement(mainDoc, elementName, elementValue));
            }

            return mainDoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private static Element createElement(Document doc, String elementName, String value) {
        Element element = doc.createElement(elementName);
        element.appendChild(doc.createTextNode(value));
        return element;
    }
}
