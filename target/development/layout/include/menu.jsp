<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<div class="header collapse d-lg-flex p-0" id="headerMenuCollapse">
    <div class="container">
        <div class="row pull-right">
            <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                    <li class="nav-item ">
                        <a href="/home" class="nav-link" style="color:black">
                            <i class="fa fa-home"></i>Home</a>
                    </li>

                    <li class="nav-item">
                        <a href="/loanApplication" class="nav-link" style="color:black"> <strong><i
                                class="fa fa-pencil"></i>New Loan Application</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/leave" class="nav-link" style="color:black"> <strong><i
                                class="fe fe-edit-2"></i>Leave Application</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/employee" class="nav-link" style="color:black"> <strong>
                            <i class="fe fe-plus"></i>Employee</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/search" class="nav-link" style="color:black"> <strong>
                            <i class="fe fe-search"></i>Leave Applicant</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/searchEmployee" class="nav-link" style="color:black"> <strong>
                            <i class="fe fe-search"></i>Search Employee</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/emiCalculator" class="nav-link" style="color:black"> <strong>
                            <i class="fe fe-search"></i>Loan EMI Calculator</strong></a>
                    </li>
                    <li class="nav-item">
                        <a href="/taxPayerRegistration" class="nav-link" style="color:black"> <strong>
                            <i class="fe fe-search"></i>Register</strong></a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>