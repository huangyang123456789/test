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

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<UserInfo> userInfo = userService.findAll();
        model.addAttribute("userList",userInfo);
        return "allUser";
    }

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){

        userInfo.setCreateBy("a");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/removeUser")
    public String removeUser(Model model,String id) {
        model.addAttribute("user",userService.removeUser(id));
        userService.removeUser(id);
        return "removeUser";
    }

    @RequestMapping("/reviseUser")
    public String toUpdatePaper(Model model, String id) {
        model.addAttribute("userInfo", userService.findUserById(id));
        return "updateUser";
    }
}
