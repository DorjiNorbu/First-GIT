package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dorji.norbu on 10-Feb-2020.
 */
@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    private EmployeeService employeeService;
    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(){ return "ttpl/getEmployeeList";}

    @ResponseBody
    @RequestMapping(value="/getEmployeeList", method=RequestMethod.GET)
    public ResponseMessage getEmployeeList() throws Exception{
        responseMessage=employeeService.getEmployeeList();
        return responseMessage;
    }

}
