package com.work.demoofgradle.service.Impl;

import com.work.demoofgradle.dao.UserDao;
import com.work.demoofgradle.entity.UserInfo;
import com.work.demoofgradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SinG
 * @Date: 2020/5/2 15:59
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        //写业务逻辑
        String rid = userInfo.getRid();
        if(null != rid ){
            return userDao.saveUser(userInfo);
        }
        else {
            return 0;
        }
    }

    @Override
    public List<UserInfo> findUserById(UserInfo userInfo) {
        List<UserInfo> list =  userDao.findUserById(userInfo);
        for (UserInfo info : list) {
            String sex = info.getRsex();
            System.out.println(sex);
            if(sex == "0"){
                sex = "女";
            }
            else {
                sex = "男";
            }
            info.setRsex(sex);
        }
        return list;
    }
    @Override
    public int updateUserById(UserInfo userInfo){
        return userDao.updateUserById(userInfo);
    }

//    @Override
//    public List<UserInfo> findRole(UserInfo userInfo) {
//        return userDao.findRole(userInfo);
//    }
}
