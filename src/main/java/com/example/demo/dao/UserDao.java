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
    /**
     * 增加用户
     * @author tyh
     * @params userInfo
     * @return int
     * @date
     */
    int saveUser(UserInfo userInfo);

    /**
     * 删除用户
     * @author tyh
     * @params id
     * @return String
     * @date
     */
    int deleteUser(String id);

    /**
     * 修改用户
     * @author tyh
     * @params userInfo
     * @return int
     * @date
     */
    int updateUser(UserInfo userInfo);

    /**
     * 查询用户
     * @author tyh
     * @params userInfo
     * @return List<UserInfo>
     * @date
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);
}
