<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/7/2020
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<div class="form-group col-md-12">
    <label class="col-md-3 required">Applicant Name:</label>

    <div class="col-md-4">
        <input type="text" id="applicantName" class="form-control field">
    </div>
</div>

<div class="form-group col-md-12">
    <div class="col-md-2 col-md-offset-3">
        <input type="submit" class="btn btn-xs btn-info btn-block" value="Search" id="btnSearch">
    </div>
</div>

<div class="form-group col-md-12">
    <label class="col-md-3 required">Applicant Name:   </label>

    <div class="col-md-4">
        <%--<input type="text" id="applicantNameDisplay" class="form-control field" readonly>--%>
        <span id="applicantNameDisplay" class="green-color"></span>
    </div>
</div>
<div class="form-group col-md-12">
    <label class="col-md-3 required">Reason:</label>

    <div class="col-md-4">
        <span id="reason" class="green-color"></span>
        <%--<input type="text" id="reason" class="form-control field" readonly>--%>
    </div>
</div>
</body>
</html>
