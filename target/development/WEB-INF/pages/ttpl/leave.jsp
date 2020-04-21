<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/7/2020
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Leave</title>
</head>
<body>

<form class="card form-horizontal" id="leaveFormId" action="<c:url value='/leave'/>" method="post">
    <div class="form-group col-md-12"></div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Applicant Name :</label>

        <div class="col-md-4">
            <input type="text" name="applicantName" id="applicantName" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">From Date:</label>

        <div class="col-md-4">
            <input type="text" name="fromDate" id="fromDate" class="form-control datepicker field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">TO Date:</label>

        <div class="col-md-4">
            <input type="text" name="toDate" id="toDate" class="form-control datepicker field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Reason:</label>

        <div class="col-md-4">
            <input type="text" name="reason" id="reason" class="form-control field">
        </div>
    </div>


    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSaveLeave">
        </div>
        <div class="col-md-2">
            <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
        </div>
    </div>

</form>
</body>
</html>
