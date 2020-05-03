package com.work.demoofgradle.dao;

import com.work.demoofgradle.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    int saveUser(UserInfo userInfo);
    List<UserInfo> findUserById(UserInfo userInfo);
    int updateUserById(UserInfo userInfo);
//    List<UserInfo> findRole(UserInfo userInfo);
}
