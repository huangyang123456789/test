package com.example.springboot_test.dao;

import com.example.springboot_test.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: mqw
 * @Date: 2020/5/2 22:36
 */
@Repository
@Mapper
public interface UserDao {

    /**
     *新增用户
     * @return
     */
    int saveUser(UserInfo userInfo);

    /**
     *查询列表
     * @return
     */
    List <UserInfo> listUserInfo(UserInfo userInfo);



    /**
     *修改用户
     * @return
     */
    int updateUser(UserInfo userInfo);

    /**
     *删除用户
     * @return
     */
    int deletUser(UserInfo userInfo);
}
