/**
 * Created by dorji.norbu on 10-Feb-2020.
 */
search = (function () {
    "use strict";
    var isSubmitted = false;


    function _baseURL() {
        return 'home/';
    }

    function getEmployeeList() {
        var url = _baseURL()+'getEmployeeList';
        $.ajax({
            url: url,
            type: 'GET',
            success: function (res) {
                if (res.responseStatus == 1) {
                    var data = res.responseDTO;
                    var dataTableDefinition = [
                        {"data": "cidNumber", class: "cidNumber hidden"}
                        , {"data": "employeeName", class: "employeeName hidden"}
                        , {"data": "mobileNumber", class: "mobileNumber hidden"}
                        , {"data": "gender", class: "gender hidden"}
                        , {"data": "emailAddress", class: "emailAddress hidden"}
                        , {"data": "designation", class: "designation hidden"}
                        , {
                            "mRender": function (data, type, row, meta) {
                                return meta.row + 1;
                            }
                        }
                        , {"data": "cidNumber", class: "cidNumber"}
                        , {"data": "employeeName", class: "employeeName"}
                        , {"data": "mobileNumber", class: "right-align mobileNumber"}
                        , {"data": "gender", class: "gender"}
                        , {"data": "emailAddress", class: "emailAddress"}
                        , {"data": "designation", class: "designation"}

                        ,{
                            "data": "null", class: "btnEdit align-middle",
                            "mRender": function () {
                                return "<a id='btnEdit' class='btn btn-sm btn-info align-middle'>Edit</a>";
                            }
                        }
                    ];
        $('#employeeListTableId').DataTable({
                        data: data
                        , columns: dataTableDefinition
                        , destroy: true
                        , bSort: false
                        //, pageLength: 50
                    });
                }
            }
        });
    }
    return {
        getEmployee: getEmployeeList()
    }
})
();
$(document).ready(    function () {
    search.getEmployee();
    });