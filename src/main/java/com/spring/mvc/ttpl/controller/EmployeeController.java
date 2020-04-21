package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.CurrentUser;
import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nzepa on 2/5/2020.
 */
@Controller
@RequestMapping("/employee")//URL:this has to be unique
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/employee"; }

    @ResponseBody
    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ResponseMessage saveEmployee(HttpServletRequest request, HttpServletResponse response,
                                        EmployeeDTO employeeDTO)
            throws Exception {
        responseMessage = employeeService.saveEmployee(employeeDTO);
        return responseMessage;
    }
}
