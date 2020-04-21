package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.LoanApplicationDTO;
import com.spring.mvc.ttpl.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dorji.norbu on 07-Feb-2020.
 */
@Controller
@RequestMapping("/loanApplication")

public class LoanApplicationController {

    @Autowired private LoanApplicationService loanApplicationService;
    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/loanApplication";//JSP
    }

    @ResponseBody
    @RequestMapping(value = "/saveLoanApplication", method = RequestMethod.POST)
    public ResponseMessage saveLoanApplication(HttpServletRequest request, HttpServletResponse response,
                                               LoanApplicationDTO loanApplicationDTO)
        throws Exception {
        responseMessage=loanApplicationService.saveLoanApplication(loanApplicationDTO);
        return responseMessage;
    }
}
