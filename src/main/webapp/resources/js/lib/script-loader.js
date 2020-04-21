$(document).ready(function () {

    if (document.URL.search("chargeAllocation") > 1)
        scriptLoader("/resources/js/ttpl/chargeAllocation.js");

    if (document.URL.search("employee") > 1)
        scriptLoader("/resources/js/ttpl/employee.js");

    if (document.URL.search("loanApplication") > 1)
        scriptLoader("/resources/js/ttpl/loanApplication.js");

    if (document.URL.search("leave") > 1)
        scriptLoader("/resources/js/ttpl/leave.js");

    if (document.URL.search("search") > 1)
        scriptLoader("/resources/js/ttpl/search.js");

    if (document.URL.search("searchEmployee") > 1)
        scriptLoader("/resources/js/ttpl/searchEmployee.js");

    if (document.URL.search("emiCalculator") > 1)
        scriptLoader("/resources/js/ttpl/emiCalculator.js");

    if (document.URL.search("home") > 1)
        scriptLoader("/resources/js/ttpl/getEmployeeList.js");

    if (document.URL.search("taxPayerRegistration") > 1)
        scriptLoader("/resources/js/ttpl/taxPayerRegistration.js");

});

var scriptLoader = function (url) {
    $.ajax(
        {
            type: "GET",
            url: url,
            dataType: "script",
            cache: false
        });
};

