package com.example3.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: tjl
 * @Date: 2020/4/30 12:12
 */
@Controller
@RequestMapping("tjl")
public class HelloSpring {
    @Value("${my.prop}")
    private String myprop;

    @RequestMapping("/123")
    @ResponseBody
    public String hello(){
        return "hello Spring" +myprop;
    }
}
