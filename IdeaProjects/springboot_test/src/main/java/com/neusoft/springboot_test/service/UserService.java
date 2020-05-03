package com.neusoft.springboot_test.service;

import com.neusoft.springboot_test.dao.UserDao;
import com.neusoft.springboot_test.entity.UserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 20:41
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int addUSer(UserInfo userInfo){
        String name = userInfo.getUserName();
        if(null != name ){
            name += "aaa";
            userInfo.setUserName(name);
            return userDao.addUser(userInfo);
        }
        else {
            return 0;
        }
    }

    public int deleteUser(UserInfo userInfo){
        List<UserInfo> list = userDao.selectUser(userInfo);
        if(list.isEmpty()){
            return 0;
        }
        else {
            return userDao.deleteUser(userInfo);
        }
    }

    public List<UserInfo> selectUser(UserInfo userInfo){
        List<UserInfo> list =  userDao.selectUser(userInfo);
        for (UserInfo info : list) {
            String sex = info.getUserSex();
            if(sex == "0"){
                sex = "女";
            }
            else {
                sex = "男";
            }
            info.setUserSex(sex);
        }
        return list;
    }

    public int changeUser(UserInfo userInfo){
        List<UserInfo> list = userDao.selectUser(userInfo);
        if(list.isEmpty()){
            return 0;
        }
        else {
            return userDao.changeUser(userInfo);
        }
    }
}
