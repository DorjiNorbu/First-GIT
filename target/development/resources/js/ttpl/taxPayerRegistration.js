
taxPayerRegistration = (function () {
    "use strict";
    var form = $('#taxPayerRegistrationFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'taxPayerRegistration/';
    }

    function saveTaxPayerRegistration() {
        $('#btnSave').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveTaxPayerRegistration';
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
                            }else if(res.responseStatus==2){
                                $("display").text(res.responseDTO.tpn);
                            }
                            else {
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
        saveTaxPayerRegistration: saveTaxPayerRegistration
    }
})
();
$(document).ready(
    function () {
        taxPayerRegistration.saveTaxPayerRegistration();
    });
