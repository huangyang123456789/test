package com.neusoft.test1.dao;

import com.neusoft.test1.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wwb
 * @Date: 2020/4/30 11:43
 */
@Repository
@Mapper
public interface UserDao {

    /**
     * 新增用户
     * @param userInfo
     */
    int saveUser(UserInfo userInfo);

    /**
     * 查询用户
     * @param userInfo
     */
    List<UserInfo>listUserInfo(UserInfo userInfo);

    /**
     * 改
     * @param userInfo
     */
    List<UserInfo>updateUser(UserInfo userInfo);

    /**
     *
     * 删除
     * @param userInfo
     */
    int deleteUser(UserInfo userInfo);
}
