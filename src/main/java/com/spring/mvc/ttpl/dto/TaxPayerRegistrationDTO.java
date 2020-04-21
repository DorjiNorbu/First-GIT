package com.spring.mvc.ttpl.dto;

import java.util.Date;

/**
 * Created by dorji.norbu on 26-Feb-2020.
 */
public class TaxPayerRegistrationDTO {

    private String tpn;
    private String taxPayerName;
    private String cidNumber;
    private Date dob;
    private String mobileNumber;
    private String agency;
    private Character type;
    private String secondaryTpn;


    public String getSecondaryTpn() {
        return secondaryTpn;
    }

    public void setSecondaryTpn(String secondaryTpn) {
        this.secondaryTpn = secondaryTpn;
    }

    public String getTpn() {
        return tpn;
    }

    public void setTpn(String tpn) {
        this.tpn = tpn;
    }

    public String getTaxPayerName() {
        return taxPayerName;
    }

    public void setTaxPayerName(String taxPayerName) {
        this.taxPayerName = taxPayerName;
    }

    public String getCidNumber() {
        return cidNumber;
    }

    public void setCidNumber(String cidNumber) {
        this.cidNumber = cidNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }
}
