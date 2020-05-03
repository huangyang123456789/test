package com.neusoft.springboot_test.controller;

import com.neusoft.springboot_test.entity.ReturnType;
import com.neusoft.springboot_test.entity.RoleInfo;
import com.neusoft.springboot_test.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 22:24
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("addrole")
    public String addRole(RoleInfo roleInfo){
        roleInfo.setRoleId(2);
        roleInfo.setUserId(3);
        int t = roleService.addRole(roleInfo);
        if(1 == t){
            return "新增用户角色"+ ReturnType.Success.getType();
        }
        else {
            return "新增用户角色"+ReturnType.failure.getType();
        }
    }

    @RequestMapping("deleterole")
    public String deleteRole(RoleInfo roleInfo){
        roleInfo.setId(5);
        int t = roleService.deleteRole(roleInfo);
        if(1 == t){
            return "删除用户角色"+ ReturnType.Success.getType();
        }
        else {
            return "删除用户角色"+ReturnType.failure.getType();
        }
    }

    @RequestMapping("selectrole")
    public List<RoleInfo> selectRole(RoleInfo roleInfo){
        roleInfo.setUserId(1);
        return roleService.selectRole(roleInfo);
    }

    @RequestMapping("changerole")
    public String changeRole(RoleInfo roleInfo){
        roleInfo.setId(5);
        roleInfo.setRoleId(3);
        int t =  roleService.changeRole(roleInfo);
        if(1 == t){
            return "更改用户角色"+ ReturnType.Success.getType();
        }
        else {
            return "更改用户角色"+ReturnType.failure.getType();
        }
    }

}
