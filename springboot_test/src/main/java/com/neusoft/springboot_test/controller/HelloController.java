package com.neusoft.springboot_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/tt")
public class HelloController {
    @Value("${my.prop}")
    private String myprop;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world"+myprop;

    }
}
