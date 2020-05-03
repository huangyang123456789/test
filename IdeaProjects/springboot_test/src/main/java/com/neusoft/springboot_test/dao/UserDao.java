package com.neusoft.springboot_test.dao;

import com.neusoft.springboot_test.entity.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 20:38
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * @name addUser
     * @params [userInfo]
     * @return int
     * 新增用户
     */
    public int addUser(UserInfo userInfo);

    /**
     * @name deleteUser
     * @params [userInfo]
     * @return int
     * 删除用户
     */
    public int deleteUser(UserInfo userInfo);

    /**
     * @name selectUser
     * @params [userInfo]
     * @return java.util.List<com.neusoft.springboot_test.entity.UserInfo>
     * 查询用户
     */
    public List<UserInfo> selectUser(UserInfo userInfo);

    /**
     * @name changeUser
     * @params [userInfo]
     * @return int
     * 修改用户密码
     */
    public int changeUser(UserInfo userInfo);
}
