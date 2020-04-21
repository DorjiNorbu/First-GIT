<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/5/2020
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
    <form class="card form-horizontal" id="employeeFormId" action="<c:url value='/employee'/>" method="post">
        <div class="form-group col-md-12"></div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">CID :</label>
            <div class="col-md-4">
                <input type="text" name="cidNumber" id="cidNumber" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Employee Name:</label>
            <div class="col-md-4">
                <input type="text" name="employeeName" id="employeeName" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Mobile Number:</label>
            <div class="col-md-4">
                <input type="text" name="mobileNumber" id="mobileNumber" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Gender:</label>
            <div class="col-md-4 form-group" >
                <input type="radio" name="gender" class="gender" id="genderM" value="M"/>
                <label for="genderM" >Male</label>
                <input type="radio" name="gender" class="gender" id="genderF" value="F"/>
                <label for="genderF">Female</label>
                <input type="radio" name="gender" class="gender" id="genderO" value="O"/>
                <label for="genderO">Other</label>
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Email Address:</label>
            <div class="col-md-4">
                <input type="text" name="emailAddress" id="emailAddress" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Designation:</label>
            <div class="col-md-4">
                <input type="text" name="designation" id="designation" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <div class="col-md-2 col-md-offset-3">
                <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSave">
            </div>
            <div class="col-md-2">
                <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
            </div>
        </div>
    </form>
</body>
</html>
