package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tyh
 * @Date: 2020-05-02 09:27
 */
@RestController
@RequestMapping("/tt")
public class HelloController {

    @Value("${my.prop}")
    private String myProp;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!! " + myProp;
    }
}
