package com.spring.mvc.ttpl.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by nzepa on 2/7/2020.
 */
@Entity
@Table(name = "leaveRecord")
public class LeaveEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "LeaveId")
    private BigInteger leaveId;

    @Column(name = "ApplicantName")
    private String applicantName;

    @Column(name = "FromDate")
    private Date fromDate;

    @Column(name = "ToDate")
    private Date toDate;

    @Column(name = "Reason")
    private String reason;


    public BigInteger getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(BigInteger leaveId) {
        this.leaveId = leaveId;
    }

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
