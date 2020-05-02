package cn.edu.zwu.usermodel.controller;

import cn.edu.zwu.usermodel.bean.User;
import cn.edu.zwu.usermodel.service.UserService;
import cn.edu.zwu.usermodel.util.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author: yjf
 * @Description: 用户控制层
 * @Date: 2020/4/30 17:07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServiceImpl;

        /**
            * @Description 查询全部用户
            * @Author yjf
            * @Parameters
            * @Return  用户列表
            * @Date 2020/4/30 21:32
            */
    @RequestMapping("/getAll")
    public List<User> getAll(){
        try {
            return userServiceImpl.getUserInfo();
        }catch (Exception e){
            return null;
        }
    }

        /**
            * @Description 新增用户
            * @Author yjf
            * @Parameters 要新增的用户
            * @Return  状态码
            * @Date 2020/4/30 21:32
            */
    @RequestMapping("/ins")
    public String insUser(User user){
        try {
            user.setCreateBy("yjf");
            user.setGmtModified(new Date());
            user.setLastModifiedBy("yjf");
            user.setVersion(1);
            user.setGmtCreate(new Date());
            user.setIsDeleted(0);
            user.setSortNo(0);
            int i = userServiceImpl.insUser(user);
            if(i==ResponseCode.SUCCESS.code){
                return ResponseCode.SUCCESS.message;
            }
            return ResponseCode.ERRO.message;
        }catch (Exception e){
            return ResponseCode.SYSTEMERRO.message;
        }

    }

        /**
            * @Description 修改用户
            * @Author yjf
            * @Parameters 要修改的用户信息
            * @Return  状态码
            * @Date 2020/4/30 21:33
            */
    @RequestMapping("/upd")
    public String updUser(User user){
        try {
            user.setGmtModified(new Date());
            user.setLastModifiedBy("yjf");
            user.setVersion(user.getVersion()+1);
            int i = userServiceImpl.updUser(user);
            if(i==ResponseCode.SUCCESS.code){
                return ResponseCode.SUCCESS.message;
            }
            return ResponseCode.ERRO.message;
        }catch (Exception e){
            return ResponseCode.SYSTEMERRO.message;
        }
    }

        /**
            * @Description 删除用户
            * @Author yjf
            * @Parameters 要删除的用户id
            * @Return  状态码
            * @Date 2020/4/30 21:33
            */
    @RequestMapping("/del")
    public String delUser(@RequestParam Integer id){
        try {
            int i = userServiceImpl.delUser(id);
            if(i==ResponseCode.SUCCESS.code){
                return ResponseCode.SUCCESS.message;
            }
            return ResponseCode.ERRO.message;
        }catch (Exception e){
            return ResponseCode.SYSTEMERRO.message;
        }
    }
}
