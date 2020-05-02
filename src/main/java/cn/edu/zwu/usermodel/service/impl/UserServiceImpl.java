package cn.edu.zwu.usermodel.service.impl;

import cn.edu.zwu.usermodel.bean.Role;
import cn.edu.zwu.usermodel.bean.RoleUser;
import cn.edu.zwu.usermodel.bean.User;
import cn.edu.zwu.usermodel.mapper.RoleMapper;
import cn.edu.zwu.usermodel.mapper.UserMapper;
import cn.edu.zwu.usermodel.service.UserService;
import cn.edu.zwu.usermodel.util.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 16:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    /**
     * @Description 获取所有用户信息
     * @Author yjf
     * @Parameters
     * @Return  所有用户信息
     * @Date 2020/4/30 21:40
     */
    @Override
    public List<User> getUserInfo() {
        List<User> users = userMapper.selAllUser();
        for (User i:users) {
            if("1".equals(i.getGender())){
                i.setGender("男");
            }else{
                i.setGender("女");
            }
        }
        return users;
    }
    /**
     * @Description 删除某个用户信息
     * @Author yjf
     * @Parameters 用户id
     * @Return
     * @Date 2020/4/30 21:40
     */
    @Override
    public int delUser(Integer id) {
        //删除用户信息
        int i = userMapper.delUser(id);
        if(i>0){
            //删除关联表信息
            int i1 = roleMapper.delUserRole(id);
            if(i1>0){
                return ResponseCode.SUCCESS.code;
            }
            return ResponseCode.ERRO.code;
        }
        return ResponseCode.ERRO.code;
    }
    /**
     * @Description 更新某个用户信息
     * @Author yjf
     * @Parameters 用户信息
     * @Return
     * @Date 2020/4/30 21:40
     */
    @Override
    public int updUser(User user) {
        int i = userMapper.updUser(user);
        if(i>0){
            //修改用户以后更新权限(先删除原来的权限再新增)
            //删除
            int i1 = roleMapper.delUserRole(user.getId());
            if(i1>0){
                //获取存储的roleId
                List<Role> roles = user.getRoles();
                List<Integer> roleId=new ArrayList<>();
                for (Role role:roles) {
                    roleId.add(role.getId());
                }
                //创建关联表对象
                RoleUser roleUser = new RoleUser();
                roleUser.setCreateBy(user.getCreateBy());
                roleUser.setGmtCreate(new Date());
                roleUser.setGmtModified(user.getGmtModified());
                roleUser.setLastModifiedBy(user.getLastModifiedBy());
                roleUser.setRoleId(roleId);
                roleUser.setIsDeleted(0);
                roleUser.setVersion(1);
                roleUser.setGmtModified(user.getGmtModified());
                roleUser.setSortNo(0);
                roleUser.setUserId(user.getId());
                //新增
                int i2 = roleMapper.insUserToRole(roleUser);
                if(i2>0){
                    return ResponseCode.SUCCESS.code;
                }
                return ResponseCode.ERRO.code;
            }
            return ResponseCode.ERRO.code;
        }
        return ResponseCode.ERRO.code;
    }
    /**
     * @Description 新增用户
     * @Author yjf
     * @Parameters 用户信息
     * @Return
     * @Date 2020/4/30 21:41
     */
    @Override
    public int insUser(User user) {
        //获取存储的roleId
        List<Role> roles = user.getRoles();
        List<Integer> roleId=new ArrayList<>();
        for (Role role:roles) {
            roleId.add(role.getId());
        }
        //创建关联表对象
        RoleUser roleUser = new RoleUser();
        roleUser.setCreateBy(user.getCreateBy());
        roleUser.setGmtCreate(user.getGmtCreate());
        roleUser.setGmtModified(user.getGmtModified());
        roleUser.setLastModifiedBy(user.getLastModifiedBy());
        roleUser.setRoleId(roleId);
        roleUser.setIsDeleted(0);
        roleUser.setVersion(1);
        roleUser.setGmtModified(user.getGmtModified());
        roleUser.setSortNo(0);
        //插入user表
        int i = userMapper.insUser(user);
        roleUser.setUserId(user.getId());
        if(i>0){
            //插入关联表
            int i1 = roleMapper.insUserToRole(roleUser);
            if(i1>0){
                return ResponseCode.SUCCESS.code;
            }
        }
        return ResponseCode.ERRO.code;
    }
}
