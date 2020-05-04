package com.springtest.springboot_test.dao;

import com.springtest.springboot_test.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cny
 * @Date: 2020/4/30 11:44
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @author cny
      * @param userInfo
     * @return int
     * @date 2020/4/30
     */
    int saveUser(UserInfo userInfo);

    /**
     * 查询用户
     * @author cny
      * @param userInfo
     * @return java.util.List<com.springtest.springboot_test.entity.UserInfo>
     * @date 2020/5/4
     */
    List<UserInfo> selectUser(UserInfo userInfo);

    /**
     * 修改用户
     * @author cny
      * @param userInfo
     * @return int
     * @date 2020/5/4
     */
    int updateUser(UserInfo userInfo);

    /**
     * 删除用户
     * @author cny
      * @param userInfo
     * @return int
     * @date 2020/5/4
     */
    int deleteUser(UserInfo userInfo);
}
