package com.neusoft.stage_work.service.impl;

import com.neusoft.stage_work.dao.userDao;
import com.neusoft.stage_work.entity.countUserInfo;
import com.neusoft.stage_work.entity.roleInfo;
import com.neusoft.stage_work.entity.userInfo;
import com.neusoft.stage_work.entity.userRoleInfo;
import com.neusoft.stage_work.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    /**
     * user dao层的对象
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:14
     */
    @Autowired
    private userDao userD;

    /**
     * 用于获取数据表中数据条数的对象
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:14
     */
    private countUserInfo countUserIn=new countUserInfo();

    /**
     * 用户表插入操作
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:15
     */
    @Override
    public int insertUser(userInfo userI) {
//        写业务逻辑
        userInfo t=new userInfo();
        t.setUserName(userI.getUserName());
        t.setIdCard(userI.getIdCard());

        List<userInfo> queryList=userD.queryUser(t);
        if(queryList.size()>=1){
            return -1;
        }

        countUserIn.setTableName("t_sys_user");
        userI.setSortNo(userD.countUser(countUserIn));
        return userD.saveUser(userI);
    }

    /**
     * 获取数据表中数据条数
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:16
     */
    @Override
    public int countUser(countUserInfo countUserI) {
        return userD.countUser(countUserI);
    }

    @Override
    public List<userInfo> queryAll() {
        return userD.queryAll();
    }

    /**
     * 用户表查询操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 09:11
     */
    @Override
    public List<userInfo> queryUser(userInfo userI) {
        List<userInfo> userInfoList=userD.queryUser(userI);
        for(int i=0;i<userInfoList.size();i++){
            if("0".equals(userInfoList.get(i).getSex())){
                userInfoList.get(i).setSex("男");
            }else{
                userInfoList.get(i).setSex("女");
            }
        }
        return userInfoList;
    }

    /**
     * 用户表修改操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:47
     */
    @Override
    public int modifyUser(userInfo userI) {
        return userD.modifyUser(userI);
    }

    /**
     * 用户表删除操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:47
     */
    @Override
    public int deleteUser(userInfo userI) {
        return userD.deleteUser(userI);
    }

    /**
     * 用户角色中间表插入操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:00
     */
    @Override
    public int insertUserRole(userRoleInfo userRoleI) {
        userRoleInfo t=new userRoleInfo();
        t.setUserId(userRoleI.getUserId());
        t.setRoleId(userRoleI.getRoleId());

        List<userRoleInfo> queryList=userD.queryUserRole(t);
        if(queryList.size()>=1){
            return -1;
        }

        countUserIn.setTableName("t_sys_user_role");
        userRoleI.setSortNo(userD.countUser(countUserIn));
        return userD.saveUserRole(userRoleI);
    }

    /**
     * 修改用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:57
     */
    @Override
    public int modifyUserRole(userRoleInfo userRoleI) {
        return userD.modifyUserRole(userRoleI);
    }

    /**
     * 删除用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:03
     */
    @Override
    public int deleteUserRole(userRoleInfo userRoleI) {
        return userD.deleteUserRole(userRoleI);
    }

    /**
     * 用户角色中间表查询操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:00
     */
    @Override
    public List<userRoleInfo> queryUserRole(userRoleInfo userRoleI) {
        return userD.queryUserRole(userRoleI);
    }

    /**
     * 新增角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:31
     */
    @Override
    public int insertRole(roleInfo roleI) {
        roleInfo t=new roleInfo();
        t.setRoleName(roleI.getRoleName());

        List<roleInfo> queryList=userD.queryRole(t);
        if(queryList.size()>=1){
            return -1;
        }

        countUserIn.setTableName("t_sys_role");
        roleI.setSortNo(userD.countUser(countUserIn));
        return userD.saveRole(roleI);
    }

    /**
     * 修改角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:11
     */
    @Override
    public int modifyRole(roleInfo roleI) {
        return userD.modifyRole(roleI);
    }

    /**
     * 删除角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:18
     */
    @Override
    public int deleteRole(roleInfo roleI) {
        return userD.deleteRole(roleI);
    }

    /**
     * 角色表查询操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:15
     */
    @Override
    public List<roleInfo> queryRole(roleInfo roleI) {
        return userD.queryRole(roleI);
    }
}
