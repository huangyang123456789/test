package com.neusoft.springboot_test.service;

import com.neusoft.springboot_test.entity.Role;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.entity.UserRole;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleInfo;
import java.util.List;

/**
 * @Author: lxc
 * @Date: 2020/05/04 11:47
 */
@Service
public interface UserService {
    int insertUser(UserInfo userInfo);

    List<UserInfo> selectUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    int deleteUser(UserInfo userInfo);

    int deleteUserReal(UserInfo userInfo);

    int insertRole(Role role);

    List<RoleInfo> selectRole(Role role);

    int updateRole(Role role);

    int deleteRole(Role role);

    int deleteRoleReal(Role role);

    int insertUserRole(UserRole userRole);

    List<UserRole> selectUserRole(UserRole userRole);

    int updateUserRole(UserRole userRole);

    int deleteUserRole(UserRole userRole);

    int deleteUserRoleReal(UserRole userRole);

}