/**
 * Created by dorji.norbu on 09-Feb-2020.
 */
search = (function () {
    "use strict";
    var isSubmitted = false;


    function _baseURL() {
        return 'emiCalculator/';
    }

    function emiCalculator() {
        $('#calculateBtn').on('click', function () {
            var loanAmount=parseInt($('#loanAmount').val());
            var termPeriod=parseInt($('#termPeriod').val());
            var interest=parseInt($('#interest').val());
            var emi=((loanAmount+((loanAmount*termPeriod*interest)/100))/(termPeriod*12));

            alert(emi);
            $('#displayDiv').toggle(true);
            $('#display').val(emi);
        });
    }


    return {
        emiCalculator: emiCalculator
    }
})
();
$(document).ready(
    function () {
        search.emiCalculator();
    });
