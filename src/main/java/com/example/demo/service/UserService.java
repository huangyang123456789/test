package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @author :tisen
 * @date :2020/5/4 12:14 上午
 */
@Service
public interface UserService {
    int insertUser(UserInfo userInfo);
}
