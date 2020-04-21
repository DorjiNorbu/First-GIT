
employee = (function () {
    "use strict";
    var form = $('#employeeFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'employee/';
    }

    function saveEmployee() {
        $('#btnSave').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveEmployee';
                    var data = $(form).serializeArray();
                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSave').attr('disabled', true);
                    $.ajax({
                        url: url,
                        type: 'post',
                        data: data,
                        processData: true,
                        success: function (res) {
                            if (res.responseStatus == 1) {
                                successMsg(res.responseText);
                            } else {
                                warningMsg(res.responseText);
                            }
                        }, complete: function () {
                            isSubmitted = false;
                            $('#btnSave').attr('disabled', false);
                        }
                    });
                }
            });
        });
    }

    return {
        saveEmployee: saveEmployee
    }
})
();
$(document).ready(
    function () {
        employee.saveEmployee();
    });
