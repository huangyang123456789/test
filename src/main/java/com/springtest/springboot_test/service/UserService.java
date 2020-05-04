package com.springtest.springboot_test.service;

import com.springtest.springboot_test.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cny
 * @Date: 2020/4/30 13:55
 */
@Service
public interface UserService {
    /**
     * 新增用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/4/30
     */
    int insertUser(UserInfo userInfo);

    /**
     * 查询列表
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
