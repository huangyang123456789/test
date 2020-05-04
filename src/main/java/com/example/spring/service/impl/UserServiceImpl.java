package com.example.spring.service.impl;

import com.example.spring.dao.UserDao;
import com.example.spring.entity.UserInfo;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: szc
 * @Date: 2020/5/2 10:07
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public  int insertUser (UserInfo userInfo){
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "a";
            //set以后才能让suername加上a
            userInfo.setUserName(userName);
        }
        //上数据库查询姓名的count
    return  userDao.saveUser(userInfo);
}
  @Override
  public List<UserInfo> listUser(UserInfo userInfo){
      String sex=userInfo.getSex();
      if("0".equals(sex)){
          sex="女";
          userInfo.setSex(sex);
      }
      else {
          sex="男";
          userInfo.setSex(sex);
      }
      return  userDao.listUserInfo(userInfo);
}
    @Override
    public int updateUser(UserInfo userInfo){
        return  userDao.updateUser(userInfo);
    }
    @Override
    public int deleteUser(UserInfo userInfo){
        return  userDao.deleteUser(userInfo);
    }
    @Override
    public int deleteReUser(UserInfo userInfo){
        return  userDao.deleteReUser(userInfo);
    }
}