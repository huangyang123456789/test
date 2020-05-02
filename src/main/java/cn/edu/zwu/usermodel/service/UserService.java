package cn.edu.zwu.usermodel.service;

import cn.edu.zwu.usermodel.bean.RoleUser;
import cn.edu.zwu.usermodel.bean.User;

import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 16:41
 */
public interface UserService {
        /**
            * @Description 获取所有用户信息
            * @Author yjf
            * @Parameters
            * @Return  所有用户信息
            * @Date 2020/4/30 21:40
            */
    List<User> getUserInfo();
        /**
            * @Description 删除某个用户信息
            * @Author yjf
            * @Parameters 用户id
            * @Return
            * @Date 2020/4/30 21:40
            */
    int delUser(Integer id);
        /**
            * @Description 更新某个用户信息
            * @Author yjf
            * @Parameters 用户信息
            * @Return
            * @Date 2020/4/30 21:40
            */
    int updUser(User user);
        /**
            * @Description 新增用户
            * @Author yjf
            * @Parameters 用户信息
            * @Return
            * @Date 2020/4/30 21:41
            */
    int insUser(User user);
}
