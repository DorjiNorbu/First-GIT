search = (function () {
    "use strict";
    var form = $('#searchFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'search/';
    }

    function getApplicant() {
        $('#btnSearch').on('click', function () {
            var url = _baseURL() + "getApplicant";
            var aName = $('#applicantName').val();
            $.ajax({
                url: url,
                type: 'GET',
                data: {applicantName: aName},
                success: function (res) {
                    if (res.responseStatus === 1) {
                        $('#applicantNameDisplay').text(res.responseDTO.applicantName);
                        $('#reason').text(res.responseDTO.reason);
                    } else {
                        warningMsg(res.responseText);
                    }
                }
            });
        });
    }


    return {
        getApplicant: getApplicant
    }
})
();
$(document).ready(
    function () {
        search.getApplicant();
    });
