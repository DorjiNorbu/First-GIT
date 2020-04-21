/**
 * Created by dorji.norbu on 09-Feb-2020.
 */
search = (function () {
    "use strict";
    var form = $('#employeeSearchId');
    var isSubmitted = false;


    function _baseURL() {
        return 'searchEmployee/';
    }

    function getEmployee() {
        $('#btnSearchEmployee').on('click', function () {
            var url = _baseURL() + "getEmployee";
            var cid = $('#employeeCid').val();
            $.ajax({
                url: url,
                type: 'GET',
                data: {employeeCid: cid},
                success: function (res) {
                    if(res.responseStatus === 1){
                        $("#searchEmployeeFormToggle").toggle();
                        $("#employeeNameDisplay").text(res.responseDTO.employeeName);
                        $("#employeeCidDisplay").text(res.responseDTO.cidNumber);
                        $("#employeeCid").val('');
                    }else{
                        warningMsg(res.responseText);
                        $("#employeeCid").val('');
                        $("#searchEmployeeFormToggle").toggle();
                    }
                }
            });
        });
    }


    return {
        getEmployee: getEmployee
    }
})
();
$(document).ready(
    function () {
        search.getEmployee();
    });
