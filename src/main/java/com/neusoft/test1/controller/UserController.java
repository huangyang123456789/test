package com.neusoft.test1.controller;

import com.neusoft.test1.entity.UserInfo;
import com.neusoft.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: wwb
 * @Date: 2020/4/30 14:04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        //对参数进行一些简单处理
        userInfo.setCreateBy("a");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }
}
