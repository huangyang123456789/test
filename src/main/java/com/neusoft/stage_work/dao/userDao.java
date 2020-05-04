package com.neusoft.stage_work.dao;

import com.neusoft.stage_work.entity.countUserInfo;
import com.neusoft.stage_work.entity.roleInfo;
import com.neusoft.stage_work.entity.userInfo;
import com.neusoft.stage_work.entity.userRoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ZEYGK
 * @Date: 2020/05/03 08:34
 */
@Repository
@Mapper
public interface userDao {

    /**
     * 新增用户
     * @Author: ZEYGK
     * @Date: 2020/05/03 08:36
     */
    int saveUser(userInfo userI);

    /**
     * 查询用户表数据
     * @Author: ZEYGK
     * @Date: 2020/05/04 08:19
     */
    List<userInfo> queryUser(userInfo userI);

    /**
     * 修改用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:41
     */
    int modifyUser(userInfo userI);

    /**
     * 删除用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:45
     */
    int deleteUser(userInfo userI);

    /**
     * 新增用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 09:20
     */
    int saveUserRole(userRoleInfo userRoleI);

    /**
     * 修改用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:53
     */
    int modifyUserRole(userRoleInfo userRoleI);

    /**
     * 删除用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:01
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
     * @Date: 2020/05/04 10:27
     */
    int saveRole(roleInfo roleI);

    /**
     * 修改角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:08
     */
    int modifyRole(roleInfo roleI);

    /**
     * 删除角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:16
     */
    int deleteRole(roleInfo roleI);

    /**
     * 查询角色表
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:12
     */
    List<roleInfo> queryRole(roleInfo roleI);

    /**
     * 查询用户表数据总数
     * @Author: ZEYGK
     * @Date: 2020/05/03 03:44
     */
    int countUser(countUserInfo countUserI);

    List<userInfo> queryAll();
}
