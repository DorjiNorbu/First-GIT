package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dorji.norbu on 09-Feb-2020.
 */
@Controller
@RequestMapping("searchEmployee")
public class SearchEmployeeController {
    @Autowired private EmployeeService employeeService;
    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(){ return "ttpl/searchEmployee";}

    @ResponseBody
    @RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
    public ResponseMessage getEmployee(String employeeCid) throws Exception{
        responseMessage=employeeService.getEmployee(employeeCid);
        return responseMessage;
    }

}
