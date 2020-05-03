package com.work.demoofgradle.service;

import com.work.demoofgradle.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 新增信息
     * @param userInfo
     * @return
     */
    int insertUser(UserInfo userInfo);

    /**
     * id find user
     * @param userInfo
     * @return
     */
    List<UserInfo> findUserById(UserInfo userInfo);

    /**
     * id update user deleted
     * @param userInfo
     * @return
     */
    int updateUserById(UserInfo userInfo);

    /**
     * find role
     * @param userInfo
     * @return
     */
//    List<UserInfo> findRole(UserInfo userInfo);
}
