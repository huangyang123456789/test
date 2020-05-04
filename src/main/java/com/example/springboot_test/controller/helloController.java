package com.example.springboot_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 * @Date: 2020/4/30 10:08
 */
@RestController
@RequestMapping("/")
public class helloController {

    @Value("${my.prop}")
    private String myProp;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!"+myProp;
    }
}
