package com.example.demo.controller;

import com.example.demo.entity.ReturnType;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author: xiaoming
 * @Date: 2020/5/3 0003 14:46
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public String insertUser(User user){
        try {
            Date date = new Date();
            user.setGmtCreate(date);
            user.setCreateBy("kong");
            user.setIsDeleted(0);
            int t = userService.insertUser(user);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户"+ ReturnType.failure.getType();
            }
            else {
                return "新增用户"+ReturnType.Success.getType();
            }
        }catch (Exception ex){
            return "事务回滚了";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/insertRole")
    public String insertRole(Role role){
        try {
            Date date = new Date();
            role.setGmtCreate(date);
            role.setCreateBy("kong");
            role.setIsDeleted(0);
            int t = userService.insertRole(role);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户"+ ReturnType.failure.getType();
            }
            else {
                return "新增用户"+ReturnType.Success.getType();
            }
        }catch (Exception ex){
            return "事务回滚了";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/insertUserRole")
    public String insertUserRole(UserRole userRole){
        try {
            Date date = new Date();
            userRole.setGmtCreate(date);
            userRole.setCreateBy("kong");
            userRole.setIsDeleted(0);
            int t = userService.insertUserRole(userRole);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户"+ ReturnType.failure.getType();
            }
            else {
                return "新增用户"+ReturnType.Success.getType();
            }
        }catch (Exception ex){
            return "事务回滚了";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/selectUser")
    public List<User> selectUser(User user){
        //对参数进行简单的处理
        return userService.selectUser(user);
    }

    @RequestMapping("/selectRole")
    public List<Role> selectRole(Role role){
        //对参数进行简单的处理
        return userService.selectRole(role);
    }

    @RequestMapping("/selectUserRole")
    public List<UserRole> selectUserRole(UserRole UserRole){
        //对参数进行简单的处理
        return userService.selectUserRole(UserRole);
    }

    @RequestMapping("/updateUser")
    public  int  updateUser(User user){
        //对参数进行简单的处理
        return userService.updateUser(user);
    }

    @RequestMapping("/updateRole")
    public  int  updateRole(Role role){
        //对参数进行简单的处理
        return userService.updateRole(role);
    }

    @RequestMapping("/updateUserRole")
    public  int  updateUserRole(UserRole userRole){
        //对参数进行简单的处理
        return userService.updateUserRole(userRole);
    }

    @RequestMapping("/deletedUser")
    public  int  deletedUser(User user){
        //对参数进行简单的处理
        return userService.deletedUser(user);
    }

    @RequestMapping("/deletedRole")
    public  int  deletedRole(Role role){
        //对参数进行简单的处理
        return userService.deletedRole(role);
    }

    @RequestMapping("/deletedUserRole")
    public  int  deletedUserRole(UserRole userRole){
        //对参数进行简单的处理
        return userService.deletedUserRole(userRole);
    }
}
