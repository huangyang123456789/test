package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiaoming
 * @Date: 2020/5/3 0003 14:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public int insertRole(Role role) {
        return userDao.saveRole(role);
    }

    @Override
    public int insertUserRole(UserRole userRole) {
        return userDao.saveUserRole(userRole);
    }

    @Override
    public List<User> selectUser(User user) {
        List<User> list =  userDao.listUser(user);
        for (User users : list) {
            String sex = users.getUserSex();
            System.out.println(sex);
            if(sex == "0"){
                sex = "女";
            }
            else {
                sex = "男";
            }
            users.setUserSex(sex);
        }
        return list;
    }

    @Override
    public List<Role> selectRole(Role role) {
        return userDao.listRole(role);
    }

    @Override
    public List<UserRole> selectUserRole(UserRole userRole) {
        return userDao.listUserRole(userRole);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int updateRole(Role role) {
        return userDao.updateRole(role);
    }

    @Override
    public int updateUserRole(UserRole userRole) {
        return userDao.updateUserRole(userRole);
    }

    @Override
    public int deletedUser(User user) {
        return userDao.deletedUser(user);
    }

    @Override
    public int deletedRole(Role role) {
        return userDao.deletedRole(role);
    }

    @Override
    public int deletedUserRole(UserRole userRole) {
        return userDao.deletedUserRole(userRole);
    }
}
