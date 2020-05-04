package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiaoming
 * @Date: 2020/5/3 0003 14:33
 */
@Service
public interface UserService {

    int insertUser(User user);

    int insertRole(Role role);

    int insertUserRole(UserRole userRole);

    List<User> selectUser(User user);

    List<Role> selectRole(Role role);

    List<UserRole> selectUserRole(UserRole userRole);

    int updateUser(User user);

    int updateRole(Role role);

    int updateUserRole(UserRole userRole);

    int deletedUser(User user);

    int deletedRole(Role role);

    int deletedUserRole(UserRole userRole);
}
