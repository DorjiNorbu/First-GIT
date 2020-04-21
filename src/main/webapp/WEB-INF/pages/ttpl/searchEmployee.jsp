<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dorji.norbu
  Date: 09-Feb-2020
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SearchEmployee</title>
</head>
<body>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Employee CID No:</label>

        <div class="col-md-4">
            <input type="text" name="employeeCid" id="employeeCid" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-5">
            <input type="submit" class="btn btn-xs btn-info btn-block" value="Search Employee" id="btnSearchEmployee">
        </div>
    </div>
    <form id="searchEmployeeFormToggle" style="display:none">
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Employee Name:   </label>

            <div class="col-md-4">
                <%--<input type="text" id="employeeNameDisplay" class="form-control field" readonly>--%>
                <span id="employeeNameDisplay" class="green-color"></span>
            </div>
        </div>
        <div class="form-group col-md-12">
            <label class="col-md-3 required">Employee CID:</label>

            <div class="col-md-4">
                <span id="employeeCidDisplay" class="green-color"></span>
                <%--<input type="text" id="employeeCidDisplay" class="form-control field" readonly>--%>
            </div>
        </div>
    </form>

</body>
</html>
