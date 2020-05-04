package com.example3.springboot.controller;

import com.example3.springboot.entity.UserInfo;
import com.example3.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: tjl
 * @Date: 2020/4/30 14:05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public int  insertUser(UserInfo userInfo){
        //对参数进行一些简单处理
        userInfo.setCreateBy("a");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/selectUser")
    public List<UserInfo> selectUserInfo(UserInfo userInfo) {


        return userService.selectUserInfo(userInfo);
    }
    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }
    @RequestMapping("/deleteUser")
    public int deleteUser(UserInfo userInfo) {
        return userService.deleteUser(userInfo);
    }
}
