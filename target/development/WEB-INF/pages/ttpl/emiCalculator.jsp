
<%--
  Created by IntelliJ IDEA.
  User: dorji.norbu
  Date: 17-Feb-2020
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EMI Calculator</title>
</head>
<body>
    <form class="card form-horizontal" id="emiFormId" action="" method="post">
        <div class="form-group col-md-12"></div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Loan Amount</label>
            <div class="col-md-4">
                <input type="text" name="loanAmount" id="loanAmount" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Loan Term</label>
            <div class="col-md-4">
                <input type="text" name="termPeriod" id="termPeriod" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Interest Rate</label>
            <div class="col-md-4">
                <input type="text" name="interest" id="interest" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-12">
            <div class="col-md-offset-3 col-md-2">
                <input type="button" name="calculateBtn" id="calculateBtn" class="form-control btn-blue" value="Calculate EMI">
            </div>
            <div class="col-md-2">
                <input type="reset"class="form-control btn-cyan" value="Reset">
            </div>
        </div>
    <div id="displayDiv" class="form-group col-md-12" style="display:none">
        <label class="col-md-3">Emi Calculated is:</label>
        <input type="text" class="col-md-3  form-control" id="display" >
    </div>
    </form>
</body>
</html>
