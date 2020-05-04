package com.example3.springboot.service;

import com.example3.springboot.dao.UserDao;
import com.example3.springboot.entity.UserInfo;
import com.example3.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @Author: tjl
 * @Date: 2020/4/30 13:57
 */
@Service
public class UserService  {
    @Autowired
    private UserDao userDao;

    public int insertUser(UserInfo userInfo){
        //业务逻辑
        String userName=userInfo.getusername();
        if(null != userName && !"".equals(userName)){
            userName+="aaa1";
            userInfo.setusername(userName);
        }
        //学号查重
//        String useracct=userInfo.getuseracct();
//        if( useracct)


        return userDao.saveUser(userInfo);
    }
    public List<UserInfo> selectUserInfo(UserInfo userInfo) {

        return userDao.selectUserInfo(userInfo);
    }
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }
    public int deleteUser(UserInfo userInfo) {
        return userDao.deleteUser(userInfo);
    }

}
