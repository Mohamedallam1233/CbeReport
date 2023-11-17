package com.mid.cpereport;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
public class AArecord {
    private String companyUniqueId;
    private String secondaryId;
    private String secondaryIdType;
    private String economicSectorIsicl4;
    private String accountNumber;
    private String accountType;
    private String currency;
    private String branchId;
    private String requestDate;
    private String rejectionDate;
    private String openingDate;
    private String closingDate;
    private String accountStatus;
    private String interestRate;
    private String dueDate;
    private String loanStatus;
    private String collaterals;
    private String cbeInitiative;
    private String initiativeJoinDate;
    private String initiativeExitDate;
    private String loanRejectionReason;
    private String facilityType;
    private String facilityPurpose;
    public AArecord () {}
    public AArecord(String companyUniqueId, String secondaryId, String secondaryIdType, String economicSectorIsicl4, String accountNumber, String accountType, String currency, String branchId, String requestDate, String rejectionDate, String openingDate, String closingDate, String accountStatus, String interestRate, String dueDate, String loanStatus, String collaterals, String cbeInitiative, String initiativeJoinDate, String initiativeExitDate, String loanRejectionReason, String facilityType, String facilityPurpose) {
        this.companyUniqueId = companyUniqueId;
        this.secondaryId = secondaryId;
        this.secondaryIdType = secondaryIdType;
        this.economicSectorIsicl4 = economicSectorIsicl4;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currency = currency;
        this.branchId = branchId;
        this.requestDate = requestDate;
        this.rejectionDate = rejectionDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.accountStatus = accountStatus;
        this.interestRate = interestRate;
        this.dueDate = dueDate;
        this.loanStatus = loanStatus;
        this.collaterals = collaterals;
        this.cbeInitiative = cbeInitiative;
        this.initiativeJoinDate = initiativeJoinDate;
        this.initiativeExitDate = initiativeExitDate;
        this.loanRejectionReason = loanRejectionReason;
        this.facilityType = facilityType;
        this.facilityPurpose = facilityPurpose;
    }

    public void setLine(String currentLine)
    {
    	String[] parts = currentLine.split(",",-1);
    	this.companyUniqueId = parts[0];
        this.secondaryId = parts[1];
        this.secondaryIdType = parts[2];
        this.economicSectorIsicl4 = parts[3];
        this.accountNumber = parts[4];
        this.accountType = parts[5];
        this.currency = parts[6];
        this.branchId = parts[7];
        this.requestDate = parts[8];
        this.rejectionDate = parts[9];
        this.openingDate = parts[10];
        this.closingDate = parts[11];
        this.accountStatus = parts[12];
        this.interestRate = parts[13];
        this.dueDate = parts[14];
        this.loanStatus = parts[15];
        this.collaterals = parts[6];
        this.cbeInitiative = parts[17];
        this.initiativeJoinDate = parts[18];
        this.initiativeExitDate = parts[19];
        this.loanRejectionReason = parts[20];
        this.facilityType = parts[21];
        this.facilityPurpose = parts[22];
    }
    
    public String getCompanyUniqueId() {
        return companyUniqueId;
    }

    public void setCompanyUniqueId(String companyUniqueId) {
        this.companyUniqueId = companyUniqueId;
    }

    public String getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
    }

    public String getSecondaryIdType() {
        return secondaryIdType;
    }

    public void setSecondaryIdType(String secondaryIdType) {
        this.secondaryIdType = secondaryIdType;
    }

    public String getEconomicSectorIsicl4() {
        return economicSectorIsicl4;
    }

    public void setEconomicSectorIsicl4(String economicSectorIsicl4) {
        this.economicSectorIsicl4 = economicSectorIsicl4;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRejectionDate() {
        return rejectionDate;
    }

    public void setRejectionDate(String rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getCollaterals() {
        return collaterals;
    }

    public void setCollaterals(String collaterals) {
        this.collaterals = collaterals;
    }

    public String getCbeInitiative() {
        return cbeInitiative;
    }

    public void setCbeInitiative(String cbeInitiative) {
        this.cbeInitiative = cbeInitiative;
    }

    public String getInitiativeJoinDate() {
        return initiativeJoinDate;
    }

    public void setInitiativeJoinDate(String initiativeJoinDate) {
        this.initiativeJoinDate = initiativeJoinDate;
    }

    public String getInitiativeExitDate() {
        return initiativeExitDate;
    }

    public void setInitiativeExitDate(String initiativeExitDate) {
        this.initiativeExitDate = initiativeExitDate;
    }

    public String getLoanRejectionReason() {
        return loanRejectionReason;
    }

    public void setLoanRejectionReason(String loanRejectionReason) {
        this.loanRejectionReason = loanRejectionReason;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityPurpose() {
        return facilityPurpose;
    }

    public void setFacilityPurpose(String facilityPurpose) {
        this.facilityPurpose = facilityPurpose;
    }
    public Document getRecordAsXmlDocument() {
        Map<String, String> elements = new HashMap<>();
        elements.put("companyuniqueid", this.getCompanyUniqueId());
        elements.put("secondaryid", this.getSecondaryId());
        elements.put("secondaryidtype", this.getSecondaryIdType());
        elements.put("economicsectorisicl4", this.getEconomicSectorIsicl4());
        elements.put("accountnumber", this.getAccountNumber());
        elements.put("accounttype", this.getAccountType());
        elements.put("currency", this.getCurrency());
        elements.put("branchid", this.getBranchId());
        elements.put("requestdate", this.getRequestDate());
        elements.put("rejectiondate", this.getRejectionDate());
        elements.put("openingdate", this.getOpeningDate());
        elements.put("closingdate", this.getClosingDate());
        elements.put("accountstatus", this.getAccountStatus());
        elements.put("interestrate", this.getInterestRate());
        elements.put("duedate", this.getDueDate());
        elements.put("loanstatus", this.getLoanStatus());
        elements.put("collaterals", this.getCollaterals());
        elements.put("cbeinitiative", this.getCbeInitiative());
        elements.put("initiativejoindate", this.getInitiativeJoinDate());
        elements.put("initiativeexitdate", this.getInitiativeExitDate());
        elements.put("loanrejectionreason", this.getLoanRejectionReason());
        elements.put("facilitytype", this.getFacilityType());
        elements.put("facilitypurpose", this.getFacilityPurpose());
        return XmlHandle.createXmlDocument("account", elements);
    }

}
