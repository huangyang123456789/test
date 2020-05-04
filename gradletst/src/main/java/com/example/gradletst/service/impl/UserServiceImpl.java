package com.example.gradletst.service.impl;

import com.example.gradletst.dao.UserDao;
import com.example.gradletst.entity.UserInfo;
import com.example.gradletst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.AssertFalse;
import java.util.List;
import java.util.UUID;

/**
 * @author gkm
 * @version 1.0
 * @date 2020/4/30 17:28
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
//        String userName=userInfo.getUserName();
//        if(null!=userName&&!"".equals(userName)){
//            userName+="aaa";
//            userInfo.setUserName(userName);
//        }

        List<UserInfo> userlists=userDao.allUserInfo(userInfo);
        for(UserInfo us : userlists){
            if(userInfo.getUserNumber()==null||userInfo.getUserNumber().equals(us.getUserNumber())){
                return 0;
            }
        }

        return userDao.saveUser(userInfo);


    }

    @Override
    public List<UserInfo> selectUser(UserInfo userInfo,String id) {
        List<UserInfo> userlists=userDao.listUserInfo(userInfo);
        if("0".equals(userlists.get(0).getUserSex())){
            userlists.get(0).setUserSex("女");
        }
        else{
            userlists.get(0).setUserSex("男");
        }
        return userlists;
    }

    @Override
    public int editUser(UserInfo userInfo, String userNumber) {
        userInfo.setUserNumber(userNumber);
        return userDao.setUser(userInfo);
    }

    @Override
    public int deleteUser( String userNumber) {

        UserInfo userInfo=new UserInfo();
        userInfo.setUserNumber(userNumber);

        return userDao.deUser(userInfo);
    }

    @Override
    public List<UserInfo> selectAll(UserInfo userInfo) {

        List<UserInfo> userlists=userDao.allUserInfo(userInfo);
        for(int i=0;i<userlists.size();i++){
            if("0".equals(userlists.get(i).getUserSex())){
                userlists.get(i).setUserSex("女");
            }
            else{
                userlists.get(i).setUserSex("男");
            }

        }
        return userlists;
    }


}
