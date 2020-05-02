package cn.edu.zwu.usermodel.mapper;

import cn.edu.zwu.usermodel.bean.User;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 16:06
 */
public interface UserMapper {

        /**
            * @Description 查询所有用户和其角色
            * @Author yjf
            * @Parameters
            * @Return  用户列表
            * @Date 2020/4/30 21:37
            */
    List<User> selAllUser();

        /**
            * @Description 删除某个用户
            * @Author yjf
            * @Parameters 用户id
            * @Return
            * @Date 2020/4/30 21:37
            */
    int delUser(Integer id);

        /**
            * @Description 更新某个用户的信息
            * @Author yjf
            * @Parameters 用户信息
            * @Return
            * @Date 2020/4/30 21:38
            */
    int updUser(User user);

        /**
            * @Description 新增用户信息
            * @Author yjf
            * @Parameters 新增的用户
            * @Return
            * @Date 2020/4/30 21:38
            */
    int insUser(User user);
}
