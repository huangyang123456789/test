package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author gkm
 * @version 1.0
 * @date 2020/4/30 17:37
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //    插入用户
    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        userInfo.setIsDeleted("0");
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    //根据账号查询用户信息
    @RequestMapping("/selectUser")
    public List<UserInfo> selectUser(UserInfo userInfo,String id){

        return userService.selectUser(userInfo,id);
    }

    //根据账号编辑用户信息
    @RequestMapping("/editUser")
    public int editUser(UserInfo userInfo,String userNumber){

        return userService.editUser(userInfo,userNumber);
    }

    //根据账号进行逻辑删除
    @RequestMapping("/deleteUser")
    public int deleteUser(UserInfo userInfo){

        return userService.deleteUser(userInfo.getUserNumber() );
    }
    //获取所有用户
    @RequestMapping("/selectAll")
    public List<UserInfo> selectAll(UserInfo userInfo){
        return userService.selectAll(userInfo);
    }
}
