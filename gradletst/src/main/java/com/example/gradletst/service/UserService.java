package com.example.gradletst.service;

import com.example.gradletst.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gkm
 * @version 1.0
 * @date 2020/4/30 17:09
 */
@Service
public interface UserService {
    int insertUser(UserInfo userInfo);
    List<UserInfo> selectUser(UserInfo userInfo, String id);
    List<UserInfo> selectAll(UserInfo userInfo);
    int editUser(UserInfo userInfo, String userNumber);
    int deleteUser(String userNumber);

}
