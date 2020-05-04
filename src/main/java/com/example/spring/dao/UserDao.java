package com.example.spring.dao;

import com.example.spring.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: szc
 * @Date: 2020/4/30 15:08
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @Author: szc
     * param userInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int saveUser(UserInfo userInfo);

    /**
     * 查找用户
     * @Author: szc
     * param userInfo
     * @return list
     * @Date: 2020/4/30 15:08
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);
    /**
    * 修改
     * @Author: szc
     * param userInfo
     * @return int
     * @Date: 2020/4/30 15:08
            */
    int updateUser(UserInfo userInfo);
    /**
     * 假删除
     * @Author: szc
     * param userInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int deleteUser(UserInfo userInfo);
    /**
     * 真删除
     * @Author: szc
     * param userInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int deleteReUser(UserInfo userInfo);
}