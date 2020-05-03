package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: tyh
 * @Date: 2020-05-02 14:12
 */
@Repository
@Mapper
public interface UserDao {
    int saveUser(UserInfo userInfo);

    int deleteUser(String id);

    int updateUser(UserInfo userInfo);

    List<UserInfo> findAll();

    UserInfo findUserById(String id);
}
