package com.example.spring.controller;

import com.example.spring.entity.UserInfo;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: szc
 * @Date: 2020/5/2 10:23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        userInfo.setCreateBy("b");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }
    @RequestMapping("listUser")
    public List listUser(UserInfo userInfo){
        return userService.listUser(userInfo);
    }
    @RequestMapping("updateUser")
    public int updateUser(UserInfo userInfo){
        return userService.updateUser(userInfo);
    }
    @RequestMapping("deleteUser")
    public int deleteUser(UserInfo userInfo){
        return userService.deleteUser(userInfo);
    }
    @RequestMapping("deleteReUser")
    public int deleteReUser(UserInfo userInfo){
        return userService.deleteReUser(userInfo);
    }
}