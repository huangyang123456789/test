package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: tyh
 * @Date: 2020-05-02 22:35
 */
@Service
@Mapper
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "aaa";
            userInfo.setUserName(userName);
        }
        return userDao.saveUser(userInfo);
    }

    @Override
    public int removeUser(String id) {

        return userDao.deleteUser(id);
    }

    @Override
    public int reviseUser(UserInfo userInfo) {

        return userDao.updateUser(userInfo);
    }
    @Override
    public List<UserInfo> findAll() {

        return userDao.findAll();
    }

    @Override
    public UserInfo findUserById(String id) {
        return userDao.findUserById(id);
    }

}
