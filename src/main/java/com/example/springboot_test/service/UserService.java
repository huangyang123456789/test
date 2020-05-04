package com.example.springboot_test.service;

import com.example.springboot_test.dao.UserDao;
import com.example.springboot_test.entity.UserInfo;
import com.example.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: mqw
 * @Date: 2020/5/3 15:25
 */
@Service
public class UserService  {
    @Autowired
    private UserDao userDao;

    public int insertUser(UserInfo userInfo) {
        //业务逻辑
        String userName = userInfo.getUserName();
        if(null !=userName && !"".equals(userName)){
            userName+=userName+"aaa";
            userInfo.setUserName(userName);
        }
        return userDao.saveUser(userInfo);
    }

    public List<UserInfo> listUserInfo(UserInfo userInfo){
        //查询
        return userDao.listUserInfo(userInfo);
    }

    public int updateUser(UserInfo userInfo) {
        //修改
        return userDao.updateUser(userInfo);
    }

    public int deletUser(UserInfo userInfo) {
        //删除

        return userDao.deletUser(userInfo);
    }

}
