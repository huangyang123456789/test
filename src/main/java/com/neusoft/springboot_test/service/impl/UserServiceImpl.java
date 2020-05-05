package com.neusoft.springboot_test.service.impl;

import com.neusoft.springboot_test.dao.UserDao;
import com.neusoft.springboot_test.entity.Role;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.entity.UserRole;
import com.neusoft.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleInfo;
import java.util.List;

/**
 * @Author: lxc
 * @Date: 2020/05/04 11:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        //写业务逻辑
        //判断用户姓名不等于null或者空
        /*String userName = userInfo.getUserName();
        if(null != userInfo.getUserName() && !"".equals(userName)){
            userName += "aaa";
            userInfo.setUserName(userName);
        }*/
        //判断用户没有相同的编号

        return userDao.saveUser(userInfo);
    }

    @Override
    public List<UserInfo> selectUser(UserInfo userInfo) {
        List<UserInfo> list =  userDao.listUserInfo(userInfo);
        for (UserInfo users : list) {
            String sex = users.getSex();
            System.out.println(sex);
            if(sex == "0"){
                sex = "女";
            }
            else {
                sex = "男";
            }
            users.setSex(sex);
        }
        return list;
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }

    @Override
    public int deleteUser(UserInfo userInfo) {
        return userDao.deleteUser(userInfo);
    }

    @Override
    public int deleteUserReal(UserInfo userInfo) {
        return userDao.deleteUserReal(userInfo);
    }

    @Override
    public int insertRole(Role role) {
        return userDao.saveRole(role);
    }

    @Override
    public List<RoleInfo> selectRole(Role role) {
        return userDao.listRoleInfo(role);
    }

    @Override
    public int updateRole(Role role) {
        return userDao.updateRole(role);
    }

    @Override
    public int deleteRole(Role role) {
        return userDao.deleteRole(role);
    }

    @Override
    public int deleteRoleReal(Role role) {
        return userDao.deleteRoleReal(role);
    }

    @Override
    public int insertUserRole(UserRole userRole) {
        return userDao.saveUserRole(userRole);
    }

    @Override
    public List<UserRole> selectUserRole(UserRole userRole) {
        return userDao.listUserRoleInfo(userRole);
    }

    @Override
    public int updateUserRole(UserRole userRole) {
        return userDao.updateUserRole(userRole);
    }

    @Override
    public int deleteUserRole(UserRole userRole) {
        return userDao.deleteUserRole(userRole);
    }

    @Override
    public int deleteUserRoleReal(UserRole userRole) {
        return userDao.deleteUserRoleReal(userRole);
    }

}