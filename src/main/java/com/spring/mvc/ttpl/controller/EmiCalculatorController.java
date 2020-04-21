package com.spring.mvc.ttpl.controller;

import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dorji.norbu on 19-Feb-2020.
 */
@Controller
@RequestMapping("/emiCalculator")
public class EmiCalculatorController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String Index(){ return "ttpl/emiCalculator";    }
}
