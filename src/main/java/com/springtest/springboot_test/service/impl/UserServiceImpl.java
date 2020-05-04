package com.springtest.springboot_test.service.impl;

import com.springtest.springboot_test.dao.UserDao;
import com.springtest.springboot_test.entity.UserInfo;
import com.springtest.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cny
 * @Date: 2020/4/30 13:58
 */
@Service
public class UserServiceImpl implements UserService {
    //写一些业务逻辑
    
    @Autowired
    private UserDao userDao;
    
    /**
     * 新增用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/5/4
     */
    @Override
    public int insertUser(UserInfo userInfo){
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "aaa";
            userInfo.setUserName(userName);
        }
        return userDao.saveUser(userInfo);
    }
    
    /**
     * 查询
     * @author cny
      * @param userInfo 
     * @return java.util.List<com.springtest.springboot_test.entity.UserInfo>
     * @date 2020/5/4
     */
    @Override
    public List<UserInfo> selectUser(UserInfo userInfo) {
        return userDao.selectUser(userInfo);
    }
    
    /**
     * 修改用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/5/4
     */
    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }
    
    /**
     * 删除用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/5/4
     */
    @Override
    public int deleteUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }
    
}
