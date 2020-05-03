package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt")
public class hellow {


    @Value("${my.prop}")
    private String myprop;

    @RequestMapping("/hello")
    public String hello(){
        return "hellow world!" + myprop;
    }
}
