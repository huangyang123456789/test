package com.example.spring.service;

import com.example.spring.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 增删查改
 *
 * @Author: szc
 * @Date: 2020/5/2 10:00
 */
@Service
public interface UserService {
    int insertUser(UserInfo userInfo);
    List listUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);
    int deleteReUser(UserInfo userInfo);

}