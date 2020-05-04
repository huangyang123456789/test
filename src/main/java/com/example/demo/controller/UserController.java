package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :tisen
 * @date :2020/5/4 12:20 上午
 */
@RestController
@RequestMapping("/user")
//@Service
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public int insertUser(UserInfo userInfo){
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/select")
    List<UserInfo> selectUser(UserInfo userInfo){
        return userService.selectUser(userInfo);
    }

    @RequestMapping("/update")
    int updateUser(UserInfo userInfo){
        return userService.updateUser(userInfo);
    }

    @RequestMapping("/delete")
    int deleteUser(UserInfo userInfo){
        return userService.deleteUser(userInfo);
    }
}
