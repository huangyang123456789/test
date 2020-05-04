package com.example.springboot_test.controller;

import com.example.springboot_test.entity.UserInfo;
import com.example.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: mqw
 * @Date: 2020/5/3 15:41
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        //参数进行一些简单处理
        //新增
        try {
            userInfo.setCreateBy("A");
            userInfo.setIsDeleted(0);
            userInfo.setId(UUID.randomUUID().toString());
            return userService.insertUser(userInfo);
        }catch (Exception e){
            return 0;
        }
    }
    @RequestMapping("/listUserInfo")
    public List<UserInfo> listUserInfo(UserInfo userInfo){
        //查询数据
        return userService.listUserInfo(userInfo);
    }


    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo){
        //参数进行一些简单处理
        //修改
        return userService.updateUser(userInfo);
    }

    @RequestMapping("/deletUser")
    public int deletUser(UserInfo userInfo){
        //参数进行一些简单处理
        //删除
        return userService.deletUser(userInfo);
    }
    public enum flag{
        SUCCESS, FAIL
    }
}
