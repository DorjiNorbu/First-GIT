package com.spring.mvc.ttpl.entity;


import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by dorji.norbu on 08-Feb-2020.
 */
@Entity
@Table(name = "loanapplication")
public class LoanApplicationEntity {

    @Column(name = "ApplicantName")
    private String applicantName;

    @Id
    @Column(name = "ApplicantCid")
    private String applicantCid;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "LoanAmount")
    private Integer loanAmount;

    @Column(name = "LoanTerm")
    private Integer termPeriod;

    @Column(name = "LoanType")
    private String loanType;

    @Column(name = "LoanAppliedDate")
    private DateTime dateTime;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantCid() {
        return applicantCid;
    }

    public void setApplicantCid(String applicantCid) {
        this.applicantCid = applicantCid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getTermPeriod() {
        return termPeriod;
    }

    public void setTermPeriod(Integer termPeriod) {
        this.termPeriod = termPeriod;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}