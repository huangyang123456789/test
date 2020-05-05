package com.neusoft.springboot_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lxc
 * @Date: 2020/04/30 20:39
 */
@RestController
//下面四个一样
//@Controller
//@Service
//@Repository
//@Component
@RequestMapping("/")
public class HelloController {
    @Value("${my.prop}")
    private String myprop;

    @RequestMapping("/hello")  //访问路径
    public String hello(){
        return "hello world!" + myprop;
    }
}