package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    int saveUser(UserInfo userInfo);

    List<UserInfo> listUserInfo(UserInfo userInfo);

    int changeUser(UserInfo userInfo);

    int deletUserReal(UserInfo userInfo);
}
