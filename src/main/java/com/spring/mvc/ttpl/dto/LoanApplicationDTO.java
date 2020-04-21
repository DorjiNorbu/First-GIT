package com.spring.mvc.ttpl.dto;


import java.math.BigInteger;
import java.util.Date;

/**
 * Created by dorji.norbu on 08-Feb-2020.
 */
public class LoanApplicationDTO {
    private String applicantName;
    private String applicantCid;
    private Date dob;
    private Integer loanAmount;
    private Integer termPeriod;
    private String loanType;

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
}
