package com.neusoft.springboot_test.dao;

import com.neusoft.springboot_test.entity.RoleInfo;
import com.neusoft.springboot_test.entity.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.List;

/**
 * @Author: nxw
 * @Date: 2020/5/2 20:38
 */
@Repository
@Mapper
public interface RoleDao {

    /**
     * @name addRole
     * @params [roleInfo]
     * @return int
     * 新增用户角色
     */
    int addRole(RoleInfo roleInfo);

    /**
     * @name deleteRole
     * @params [roleInfo]
     * @return int
     * 删除用户角色
     */
    int deleteRole(RoleInfo roleInfo);

    /**
     * @name selectRole
     * @params [roleInfo]
     * @return java.util.List<com.neusoft.springboot_test.entity.RoleInfo>
     * 查询用户角色
     */
    List<RoleInfo> selectRole(RoleInfo roleInfo);

    /**
     * @name changeRole
     * @params [roleInfo]
     * @return int
     * 更改用户角色
     */
    int changeRole(RoleInfo roleInfo);
}
