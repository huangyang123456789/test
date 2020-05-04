package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wwb
 * @Date: 2020/4/30 10:34
 */
@Controller
@RequestMapping("/tt")
public class hello {
    @Value("${my.prop}")
    private  String myprop;
    @RequestMapping("/hello")
    @ResponseBody
    public  String hello(){
        return  "hello world!"+myprop;
    }
}