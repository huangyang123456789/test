package com.example.gradletst.dao;

import com.example.gradletst.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gkm
 * @version 1.0
 * @date 2020/4/30 16:27
 */
@Repository
@Mapper
public interface UserDao {
//    新增用户
    int saveUser(UserInfo userInfo);
    List<UserInfo> listUserInfo(UserInfo userInfo);
    int setUser(UserInfo userInfo);
    int deUser(UserInfo userInfo);
    List<UserInfo> allUserInfo(UserInfo userInfo);

}
