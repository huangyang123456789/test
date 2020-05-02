package cn.edu.zwu.usermodel.mapper;

import cn.edu.zwu.usermodel.bean.Role;
import cn.edu.zwu.usermodel.bean.RoleUser;

import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 16:35
 */
public interface RoleMapper {
        /**
            * @Description 获取某个用户的角色列表
            * @Author yjf
            * @Parameters 用户id
            * @Return  角色列表
            * @Date 2020/4/30 21:34
            */
    List<Role> getAllRoleName(Integer id);

        /**
            * @Description 新增某个用户的角色到关联表
            * @Author yjf
            * @Parameters 关联用户id和该用户的角色id
            * @Return
            * @Date 2020/4/30 21:35
            */
    int insUserToRole(RoleUser roleUser);

        /**
            * @Description 删除关联表中的某个用户的角色
            * @Author yjf
            * @Parameters 用户id
            * @Return
            * @Date 2020/4/30 21:36
            */
    int delUserRole(Integer uid);
}
