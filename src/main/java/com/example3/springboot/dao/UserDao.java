package com.example3.springboot.dao;

import com.example3.springboot.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @return int
     */
    int saveUser(UserInfo userInfo);
    List<UserInfo> selectUserInfo(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);
}
