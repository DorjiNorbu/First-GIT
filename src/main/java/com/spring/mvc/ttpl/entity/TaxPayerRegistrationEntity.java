package com.spring.mvc.ttpl.entity;

import org.exolab.castor.types.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dorji.norbu on 26-Feb-2020.
 */
@Entity
@Table(name = "taxpayer")
public class TaxPayerRegistrationEntity {

    @Id
    @Column(name = "tpn")
    private String tpn;

    @Column(name = "taxPayerName")
    private String taxPayerName;

    @Column(name = "cidNumber")
    private String cidNumber;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "mobileNumber")
    private String mobileNumber;
    @Column(name = "agency")
    private String agency;
    @Column(name = "type")
    private Character type;

    @Column(name = "setDate")
    private Date setDate;
    @Column(name= "secondaryTpn")
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

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }
}
