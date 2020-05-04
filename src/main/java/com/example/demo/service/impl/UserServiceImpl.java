package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :tisen
 * @date :2020/5/4 12:15 上午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        String userName = userInfo.getName();
        if(null != userName && !"".equals(userName)){
            userInfo.setName(userName);
        }
        return userDao.saveUser(userInfo);
    }
}
