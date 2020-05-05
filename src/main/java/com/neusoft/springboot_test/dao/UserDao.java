package com.neusoft.springboot_test.dao;

import com.neusoft.springboot_test.entity.Role;
import com.neusoft.springboot_test.entity.UserInfo;
import com.neusoft.springboot_test.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.relation.RoleInfo;
import java.util.List;

/**
 * @Author: lxc
 * @Date: 2020/05/04 10:01
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int saveUser(UserInfo userInfo);

    /**
     * 查询用户
     * @author lxc
     * @param
     * @return java.util.List
     * @date 2020-04-30
     */
    List<UserInfo> listUserInfo(UserInfo userInfo);

    /**
     * 更新用户
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int updateUser(UserInfo userInfo);

    /**
     * 假删除用户
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteUser(UserInfo userInfo);

    /**
     * 真删除用户
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteUserReal(UserInfo userInfo);

    /**
     * 新增角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int saveRole(Role role);

    /**
     * 查询角色
     * @author lxc
     * @param
     * @return java.util.List
     * @date 2020-04-30
     */
    List<RoleInfo> listRoleInfo(Role role);

    /**
     * 更新角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int updateRole(Role role);

    /**
     * 假删除角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteRole(Role role);

    /**
     * 真删除角
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteRoleReal(Role role);

    /**
     * 新增用户角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int saveUserRole(UserRole userRole);

    /**
     * 查询用户角色
     * @author lxc
     * @param
     * @return java.util.List
     * @date 2020-04-30
     */
    List<UserRole> listUserRoleInfo(UserRole userRole);

    /**
     * 更新用户角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int updateUserRole(UserRole userRole);

    /**
     * 假删除用户角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteUserRole(UserRole userRole);

    /**
     * 真删除用户角色
     * @author lxc
     * @param
     * @return int
     * @date 2020-04-30
     */
    int deleteUserRoleReal(UserRole userRole);
}