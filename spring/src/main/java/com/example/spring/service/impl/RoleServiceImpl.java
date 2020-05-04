package com.example.spring.service.impl;

import com.example.spring.dao.RoleDao;
import com.example.spring.entity.RoleInfo;
import com.example.spring.entity.UserInfo;
import com.example.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: szc
 * @Date: 2020/5/4 11:48
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    @Override
    public  int insertRole (RoleInfo roleInfo){
        String roleId = roleInfo.getRoleId();
        if(null != roleId && !"".equals(roleId)){
            roleId = roleId + "a";
            roleInfo.setRoleId(roleId);
        }
        //上数据库查询姓名的count
        return  roleDao.saveRole(roleInfo);
    }
    @Override
    public List<RoleInfo>listRole(RoleInfo roleInfo){
        return  roleDao.listRoleInfo(roleInfo);
    }
    @Override
    public int updateRole(RoleInfo roleInfo){
        return  roleDao.updateRole(roleInfo);
    }
    @Override
    public int deleteRole(RoleInfo roleInfo){
        return  roleDao.updateRole(roleInfo);
    }
    @Override
    public int deleteReRole(RoleInfo roleInfo){
        return  roleDao.updateRole(roleInfo);
    }
}