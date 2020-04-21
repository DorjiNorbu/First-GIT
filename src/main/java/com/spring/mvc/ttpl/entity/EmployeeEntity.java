package com.spring.mvc.ttpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nzepa on 2/5/2020.
 */
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @Column(name = "CidNo")
    private String cidNumber;

    @Column(name = "EmployeeName")
    private String employeeName;

    @Column(name = "MobileNo")
    private Integer mobileNumber;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "Designation")
    private String designation;

    public String getCidNumber() {
        return cidNumber;
    }

    public void setCidNumber(String cidNumber) {
        this.cidNumber = cidNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
