package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: tyh
 * @Date: 2020-05-02 22:24
 */
@Service
public interface UserService {

    int insertUser(UserInfo userInfo);

    int deleteUser(String id);

    int updateUser(UserInfo userInfo);

    List<UserInfo> listUserInfo(UserInfo userInfo);
}
