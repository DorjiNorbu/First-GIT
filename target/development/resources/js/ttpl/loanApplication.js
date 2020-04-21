/**
 * Created by dorji.norbu on 08-Feb-2020.
 */

loanApplication = (function () {
    "use strict";
    var form = $('#loanApplicationFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'loanApplication/';
    }

    function saveLoanApplication() {
        $('#btnSaveLoan').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveLoanApplication';
                    var data = $(form).serializeArray();
                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSaveLoan').attr('disabled', true);
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
                        },
                        error:true,
                        complete: function () {
                            isSubmitted = false;
                            $('#btnSaveLoan').attr('disabled', false);
                        }
                    });
                }
            });
        });
    }

    return {
        saveLoanApplication: saveLoanApplication
    }
})
();
$(document).ready(
    function () {
        loanApplication.saveLoanApplication();
    });
