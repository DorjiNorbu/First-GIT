package com.spring.mvc.ttpl.controller;

import com.spring.mvc.helper.ResponseMessage;
import com.spring.mvc.ttpl.dto.EmployeeDTO;
import com.spring.mvc.ttpl.dto.LeaveDTO;
import com.spring.mvc.ttpl.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nzepa on 2/7/2020.
 */
@Controller
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/leave";//JSP
    }

    @ResponseBody
     @RequestMapping(value = "/saveLeave", method = RequestMethod.POST)
     public ResponseMessage saveLeave(HttpServletRequest request, HttpServletResponse response,
                                      LeaveDTO employeeDTO) throws Exception {
        responseMessage = leaveService.saveLeave(employeeDTO);
        return responseMessage;
    }

}
