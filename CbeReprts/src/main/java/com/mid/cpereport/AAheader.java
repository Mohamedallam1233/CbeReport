package com.mid.cpereport;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

public class AAheader {
    private String bankcode;
    private String month;
    private String noofaccounts;

    public AAheader() {
        super();
    }

    public AAheader(String bankcode, String month, String noofaccounts) {
        super();
        this.bankcode = bankcode;
        this.month = month;
        this.noofaccounts = noofaccounts;
    }
    public void setLine(String currentLine) {
    	String[] hparts = currentLine.split(",",-1);
    	this.bankcode = hparts[0];
        this.month = hparts[1];
        this.noofaccounts = hparts[2];
    }
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setNoofaccounts(String noofaccounts) {
        this.noofaccounts = noofaccounts;
    }

    public String getBankcode() {
        return bankcode;
    }

    public String getMonth() {
        return month;
    }

    public String getNoofaccounts() {
        return noofaccounts;
    }



    public Document getHeaderAsXmlDocument() {
        Map<String, String> elements = new HashMap<>();
        elements.put("bankcode", this.getBankcode());
        elements.put("month", this.getMonth());
        elements.put("noofaccounts", this.getNoofaccounts());
        return XmlHandle.createXmlDocument("header", elements);
    }
}
