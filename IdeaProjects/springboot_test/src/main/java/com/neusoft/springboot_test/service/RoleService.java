package com.neusoft.springboot_test.service;

import com.neusoft.springboot_test.dao.RoleDao;
import com.neusoft.springboot_test.entity.RoleInfo;
import com.neusoft.springboot_test.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 22:16
 */
@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public int addRole(RoleInfo roleInfo){
        return roleDao.addRole(roleInfo);
    }

    public int deleteRole(RoleInfo roleInfo){
        List<RoleInfo> list = roleDao.selectRole(roleInfo);
        if(list.isEmpty()){
            return 0;
        }
        else {
            return roleDao.deleteRole(roleInfo);
        }
    }

    public List<RoleInfo> selectRole(RoleInfo roleInfo){
        return roleDao.selectRole(roleInfo);
    }

    public int changeRole(RoleInfo roleInfo){
        List<RoleInfo> list = roleDao.selectRole(roleInfo);
        if(list.isEmpty()){
            return 0;
        }
        else {
            return roleDao.changeRole(roleInfo);
        }
    }
}
