package com.example.springboot_mytest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wwb
 * @Date: 2020/5/1 0001 12:58
 */
@RestController
@RequestMapping("/tt")
public class HelloController {

    @Value("${my.prop}")
    private String myprop;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!!"+myprop;
    }
}
