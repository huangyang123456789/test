package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :tisen
 * @date :2020/5/4 12:14 上午
 */
@Service
public interface UserService {
    int insertUser(UserInfo userInfo);
    List<UserInfo> selectUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);
}
