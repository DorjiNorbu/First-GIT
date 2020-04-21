<%--
  Created by IntelliJ IDEA.
  User: dorji.norbu
  Date: 07-Feb-2020
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Loan Application</title>
</head>
<body>
    <form class="card from-horizontal" id="loanApplicationFormId" action="<c:url value='/loanApplication'/>"
          method="post">
        <div class="form-group col-md-12"></div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Applicant Name :</label>
            <div class="col-md-4">
                <input type="text" name="applicantName" id="applicantName" class="form-control"
                       placeholder="Enter Applicant Name">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Applicant CID:</label>
            <div class="col-md-4">
                <input type="text" name="applicantCid" id="applicantCid" class="form-control"
                       placeholder="Enter Applicant CID">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Date of Birth:</label>
            <div class="col-md-4">
                <input type="text" name="dob" id="dob" class="form-control datepicker field"
                       placeholder="dd-mm-yyyy"">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Loan Amount Applied:</label>
            <div class="col-md-4">
                <input type="text" name="loanAmount" id="loanAmount" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Loan Term Period:</label>
            <div class="col-md-4">
                <select name="termPeriod" id="termPeriod" class="form-control">
                    <option value="0">Select Term Period</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </div>
        </div>\
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Loan Type Applying:</label>
            <div class="col-md-4">
                <select name="loanType" id="loanType" class="form-control">
                    <option value="none">Select Loan Type</option>
                    <option value="agriculturalLoan">Agricultural Loan</option>
                    <option value="employeeLoan">Employee Loan</option>
                    <option value="consumerLoan">Consumer Loan</option>
                    <option value="vechicleLoan">Vechicle Loan</option>
                    <option value="staffLoan">Staff Loan</option>
                </select>
            </div>
        </div>
        <div class="form-group col-md-12">
            <div class="col-md-2 col-md-offset-3">
                <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSaveLoan">
            </div>
            <div class="col-md-2">
                <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
            </div>
        </div>
    </div>

    </form>
</body>
</html>
