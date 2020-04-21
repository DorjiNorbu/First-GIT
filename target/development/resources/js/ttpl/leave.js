leave = (function () {
    "use strict";
    var form = $('#leaveFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'leave/';
    }

    function saveLeave() {
        $('#btnSaveLeave').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveLeave';
                    var data = $(form).serializeArray();

                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSaveLeave').attr('disabled', true);
                    $.ajax({
                        url: url,
                        type: 'post',
                        data: data,
                        processData: true,
                        success: function (res) {
                            if (res.responseStatus === 1) {
                                successMsg(res.responseText);
                                reset();
                            } else {
                                warningMsg(res.responseText);
                            }
                        }, complete: function () {
                            isSubmitted = false;
                            $('#btnSaveLeave').attr('disabled', false);
                        }
                    });
                }
            });
        });
    }

    function reset(){
        $('.field').val('');
    }

    return {
        saveLeave: saveLeave
    }
})
();
$(document).ready(
    function () {
        leave.saveLeave();
    });
