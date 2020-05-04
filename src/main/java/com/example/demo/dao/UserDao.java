package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.Role;
import com.example.demo.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xiaoming
 * @Date: 2020/5/2 0002 21:14
 */
@Repository
@Mapper //用于找到mapper的xml文件
public interface UserDao {
    /**
     * 新增学生
     * @return  int
     */
    int saveUser(User user);

    int saveRole(Role role);

    int saveUserRole(UserRole userRole);

    List<User> listUser(User user);

    List<Role> listRole(Role role);

    List<UserRole> listUserRole(UserRole userRole);

    int updateUser(User user);

    int updateRole(Role role);

    int updateUserRole(UserRole userRole);

    int deletedUser(User user);

    int deletedRole(Role role);

    int deletedUserRole(UserRole userRole);
}
