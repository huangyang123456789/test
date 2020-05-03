package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    /**
     * 新增
     * @author tyh
     * @params userInfo
     * @return int
     * @date
     */
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
    public int deleteUser(String id) {

        return userDao.deleteUser(id);
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        int userInfos = userDao.updateUser(userInfo);
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){

        }else{
            return 0;
        }
        return userInfos;
    }

    /**
     * 查询
     * @author tyh
     * @params
     * @return
     * @date
     */
    @Override
    public List<UserInfo> listUserInfo(UserInfo userInfo) {
        List eptls = null;
        List<UserInfo> userInfos=userDao.listUserInfo(userInfo);
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){

        }else{
            System.out.println("请输入姓名");
            return eptls;
        }
        return userInfos;
    }

}
