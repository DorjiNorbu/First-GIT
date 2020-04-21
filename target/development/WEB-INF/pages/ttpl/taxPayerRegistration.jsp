<%--
  Created by IntelliJ IDEA.
  User: dorji.norbu
  Date: 26-Feb-2020
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Tax Payer Registration</title>
</head>
<body>
<form class="card form-horizontal" id="taxPayerRegistrationFormId" action="<c:url value='/taxPayerRegistration'/>"
      method="post" autocomplete="off">
    <div class="form-group col-md-12"></div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Tax Payer Name :</label>

        <div class="col-md-4">
            <input type="text" name="taxPayerName" id="taxPayerName" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">CID:</label>

        <div class="col-md-4">
            <input type="text" name="cidNumber" id="cidNumber" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">DOB:</label>

        <div class="col-md-4">
            <input type="text" name="dob" id="dob" class="form-control datepicker field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Mobile Number:</label>

        <div class="col-md-4">
            <input type="text" name=mobileNumber id="mobileNumber" class="form-control field">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Working Agency</label>

        <div class="col-md-4">
            <input type="text" name=agency id="agency" class="form-control field">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Tax Payer Type</label>

        <div class="col-md-4">
            <select name=type id="type" class="form-control field">
                <option value='P'>Personal Income</option>
                <option value='B'>Business Income</option>
                </select>
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
    <span id="display"></span>
</body>
</html>
