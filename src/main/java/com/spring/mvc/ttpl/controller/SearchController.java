package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nzepa on 2/7/2020.
 */
@Controller
@RequestMapping("search")
public class SearchController {
    @Autowired
    private LeaveService leaveService;
    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/search";//JSP
    }

    @ResponseBody
    @RequestMapping(value = "/getApplicant", method = RequestMethod.GET)
    public ResponseMessage getApplicant(String applicantName) throws Exception {
        responseMessage = leaveService.getApplicant(applicantName);
        return responseMessage;
    }
}
