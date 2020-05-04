package com.neusoft.test1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsy
 * @Date: 2020/5/3 15:34
 */
@RestController
@RequestMapping("/tt")
public class HelloController {
    @Value("${my.prop}")
    private  String myprop;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!!!!"+myprop;
    }
}