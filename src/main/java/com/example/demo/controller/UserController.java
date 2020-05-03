package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @Author: tyh
 * @Date: 2020-05-02 22:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<UserInfo> listUserInfo(UserInfo userInfo){
        List<UserInfo> userInfos = userService.listUserInfo(userInfo);
        return userInfos;
    }

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){

        userInfo.setCreateBy("a");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Model model,String id) {
        model.addAttribute("user",userService.deleteUser(id));
        userService.deleteUser(id);
        return "removeUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "reviseUser";
    }
}
