package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.ReturnType;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.service.UserService;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 20:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("adduser")
    public String addUser(UserInfo userInfo){
        try {
            userInfo.setUserPwd("qwea");
            userInfo.setUserSex("0");
            int t = userService.addUSer(userInfo);
            if(0 == t){
                return "新增用户"+ReturnType.failure.getType();
            }
            else {
                return "新增用户"+ReturnType.Success.getType();
            }
        }catch (Exception ex){
            return "用户名不能为空";
        }
    }

    @RequestMapping("deleteuser")
    public String deleteUser(UserInfo userInfo){
        userInfo.setUserId(2);
        int t = userService.deleteUser(userInfo);
        if(0 == t){
            return "删除用户"+ReturnType.failure.getType();
        }
        else {
            return "删除用户"+ReturnType.Success.getType();
        }
    }

    @RequestMapping("selectuser")
    public List<UserInfo> selectUser(UserInfo userInfo){
        userInfo.setUserId(1);
        return userService.selectUser(userInfo);
    }

    @RequestMapping("changeuser")
    public String changeUser(UserInfo userInfo){
        userInfo.setUserId(2);
        userInfo.setUserPwd("asd");
        int t = userService.changeUser(userInfo);
        if(0 == t){
            return "更改用户密码"+ReturnType.failure.getType();
        }
        else {
            return "更改用户密码"+ReturnType.Success.getType();
        }
    }
}
