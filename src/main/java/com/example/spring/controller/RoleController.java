package com.example.spring.controller;

import com.example.spring.entity.RoleInfo;
import com.example.spring.entity.UserInfo;
import com.example.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: szc
 * @Date: 2020/5/4 11:01
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/insertRole")
    public int insertRole(RoleInfo roleInfo){
        roleInfo.setCreateBy("b");
        roleInfo.setIsDeleted(0);
        roleInfo.setId(UUID.randomUUID().toString());
        return roleService.insertRole(roleInfo);
    }
    @RequestMapping("listRole")
    public List listRole(RoleInfo roleInfo){
        return roleService.listRole(roleInfo);
    }
    @RequestMapping("updateRole")
    public int updateRole(RoleInfo roleInfo){
        return roleService.updateRole(roleInfo);
    }
    @RequestMapping("deleteRole")
    public int deleteRole(RoleInfo roleInfo){
        return roleService.deleteRole(roleInfo);
    }
    @RequestMapping("deleteReRole")
    public int deleteReRole(RoleInfo roleInfo){
        return roleService.deleteReRole(roleInfo);
    }
}