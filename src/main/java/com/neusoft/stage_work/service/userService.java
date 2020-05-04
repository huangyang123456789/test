package com.neusoft.stage_work.service;

import com.neusoft.stage_work.entity.countUserInfo;
import com.neusoft.stage_work.entity.roleInfo;
import com.neusoft.stage_work.entity.userInfo;
import com.neusoft.stage_work.entity.userRoleInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZEYGK
 * @Date: 2020/05/03 09:35
 */
@Service
public interface userService {
    /**
     * 新增用户
     * @Author: ZEYGK
     * @Date: 2020/05/03 09:49
     */
    int insertUser(userInfo userI);

    /**
     * 查询用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 08:58
     */
    List<userInfo> queryUser(userInfo userI);

    /**
     * 修改用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:35
     */
    int modifyUser(userInfo userI);

    /**
     * 删除用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:46
     */
    int deleteUser(userInfo userI);

    /**
     * 新增用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 09:37
     */
    int insertUserRole(userRoleInfo userRoleI);

    /**
     * 修改用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:55
     */
    int modifyUserRole(userRoleInfo userRoleI);

    /**
     * 删除用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:02
     */
    int deleteUserRole(userRoleInfo userRoleI);

    /**
     * 查询用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 09:58
     */
    List<userRoleInfo> queryUserRole(userRoleInfo userRoleI);

    /**
     * 新增角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:30
     */
    int insertRole(roleInfo roleI);

    /**
     * 修改角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:11
     */
    int modifyRole(roleInfo roleI);

    /**
     * 删除角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:17
     */
    int deleteRole(roleInfo roleI);

    /**
     * 查询角色表
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:14
     */
    List<roleInfo> queryRole(roleInfo roleI);

    /**
     * 查询数据表条数
     * @Author: ZEYGK
     * @Date: 2020/05/03 03:53
     */
    int countUser(countUserInfo countUserI);

    /**
     * 查询所有用户及其对应角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:04
     */
    List<userInfo> queryAll();
}
