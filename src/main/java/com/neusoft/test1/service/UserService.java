package com.neusoft.test1.service;

import com.neusoft.test1.dao.UserDao;
import com.neusoft.test1.entity.UserInfo;
import com.neusoft.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wwb
 * @Date: 2020/4/30 13:57
 */
@Service
public class UserService{

    @Autowired
    private UserDao userDao;

    public int insertUser(UserInfo userInfo) {
        //写业务逻辑
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "aaa";
            userInfo.setUserName(userName);
        }
        return userDao.saveUser(userInfo);
    }
}
