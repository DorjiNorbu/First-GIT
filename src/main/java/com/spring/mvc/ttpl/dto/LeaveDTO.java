package com.spring.mvc.ttpl.dto;


import java.util.Date;

/**
 * Created by nzepa on 2/7/2020.
 */
public class LeaveDTO {

    private String applicantName;
    private Date fromDate;
    private Date toDate;
    private String reason;


    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
