package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.Enumclass;
import com.neusoft.springboot_test.entity.Role;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.entity.UserRole;
import com.neusoft.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.RoleInfo;
import java.util.Date;
import java.util.List;

/**
 * @Author: lxc
 * @Date: 2020/05/04 12:09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public Object insertUser (UserInfo userInfo) {
        //对参数进行一些简单处理
        try {
            Date date = new Date();
            userInfo.setGmtCreate(date);
            userInfo.setCreateBy("xia1");
            userInfo.setIsDeleted(0);
            int t = userService.insertUser(userInfo);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户" + Enumclass.failure.getEnum();
            }
            else {
                return "新增用户" + Enumclass.Success.getEnum();
            }
        }catch (Exception ex){
            return "回滚";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/selectUser")
    public List<UserInfo> selectUser(UserInfo userInfo){
        //对参数进行简单的处理
        return userService.selectUser(userInfo);
    }

    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo){
        //对参数进行简单的处理
        return userService.updateUser(userInfo);
    }

    @RequestMapping("/deleteUser")
    public int deletedUser(UserInfo userInfo){
        //对参数进行简单的处理
        return userService.deleteUser(userInfo);
    }

    @RequestMapping("/deleteRealUser")
    public int deleteUserReal(UserInfo userInfo){
        //对参数进行简单的处理
        return userService.deleteUserReal(userInfo);
    }

    @RequestMapping("/insertRole")
    public Object insertRole (Role role) {
        //对参数进行一些简单处理
        try {
            Date date = new Date();
            role.setGmtCreate(date);
            role.setCreateBy("xia2");
            role.setIsDeleted(0);
            int t = userService.insertRole(role);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增角色" + Enumclass.failure.getEnum();
            }
            else {
                return "新增角色" + Enumclass.Success.getEnum();
            }
        }catch (Exception ex){
            return "回滚";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/selectRole")
    public List<RoleInfo> selectUser(Role role){
        //对参数进行简单的处理
        return userService.selectRole(role);
    }

    @RequestMapping("/updateRole")
    public int updateRole(Role role){
        //对参数进行简单的处理
        return userService.updateRole(role);
    }

    @RequestMapping("/deleteRole")
    public int deleteRole(Role role){
        //对参数进行简单的处理
        return userService.deleteRole(role);
    }

    @RequestMapping("/deleteRealRole")
    public int deleteRoleReal(Role role){
        //对参数进行简单的处理
        return userService.deleteRoleReal(role);
    }

    @RequestMapping("/insertUserRole")
    public Object insertUserRole (UserRole userRole) {
        //对参数进行一些简单处理
        try {
            Date date = new Date();
            userRole.setGmtCreate(date);
            userRole.setCreateBy("xia2");
            userRole.setIsDeleted(0);
            int t = userService.insertUserRole(userRole);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户角色" + Enumclass.failure.getEnum();
            }
            else {
                return "新增用户角色" + Enumclass.Success.getEnum();
            }
        }catch (Exception ex){
            return "回滚";
        }finally {
            return "结束";
        }
    }

    @RequestMapping("/selectUserRole")
    public List<UserRole> selectUserRole(UserRole UserRole){
        //对参数进行简单的处理
        return userService.selectUserRole(UserRole);
    }

    @RequestMapping("/updateUserRole")
    public int updateUserRole(UserRole UserRole){
        //对参数进行简单的处理
        return userService.updateUserRole(UserRole);
    }

    @RequestMapping("/deleteUserRole")
    public int deletedUser(UserRole UserRole){
        //对参数进行简单的处理
        return userService.deleteUserRole(UserRole);
    }

    @RequestMapping("/deleteRealUserRole")
    public int deleteUserRoleReal(UserRole UserRole){
        //对参数进行简单的处理
        return userService.deleteUserRoleReal(UserRole);
    }
}