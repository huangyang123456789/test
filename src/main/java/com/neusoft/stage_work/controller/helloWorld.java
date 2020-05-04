package com.neusoft.stage_work.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZEYGK
 * @Date: 2020/05/02 10:22
 */
@RestController
@RequestMapping("/")
public class helloWorld {

    @Value("${my.myValue}")
    private String myValue;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!"+myValue;
    }
}
