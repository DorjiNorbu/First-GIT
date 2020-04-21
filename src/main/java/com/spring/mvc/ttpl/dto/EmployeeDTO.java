package com.spring.mvc.ttpl.dto;

/**
 * Created by nzepa on 2/5/2020.
 */
public class EmployeeDTO {

    //region private variables
    private String cidNumber;
    private String employeeName;
    private Integer mobileNumber;
    private String gender;
    private String emailAddress;
    private String designation;
    //endregion

    //region setters and getters

    public String getCidNumber() { return cidNumber;}

    public void setCidNumber(String cidNumber) {this.cidNumber = cidNumber;
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
