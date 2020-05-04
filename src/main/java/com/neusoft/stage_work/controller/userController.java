package com.neusoft.stage_work.controller;

import com.neusoft.stage_work.entity.*;
import com.neusoft.stage_work.service.impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.List;
import java.util.UUID;

/**
 * 用户管理
 * @Author: ZEYGK
 * @Date: 2020/05/03 09:50
 */
@RestController
@RequestMapping("/user")
@RestControllerAdvice
public class userController {

    @Autowired
    private userServiceImpl userS;
    private userInfo userI;
    private countUserInfo countUserI;

    /**
     * 统一异常处理
     * @Author: ZEYGK
     * @Date: 2020/05/04 06:56
     */
    @ExceptionHandler
    public String handleException(Exception e){
        if(e instanceof NullPointerException){
            return returnType.nullPointerFailure.getType();
        }else if(e instanceof IllegalArgumentException){
            return returnType.illegalArgumentFailure.getType();
        }else if(e instanceof SQLException){
            return returnType.SQLFailure.getType();
        }else if(e instanceof SQLSyntaxErrorException){
            return returnType.SQLSyntaxErrorFailure.getType();
        }
        return returnType.unknownFailure.getType();
    }

    /**
     * 用户表插入操作
     * @Author: ZEYGK
     * @Date: 2020/05/03 03:16
     */
    @RequestMapping("/insertUser")
    public String insertUser(userInfo userI){
//        对参数进行简单处理
        userI.setId(UUID.randomUUID().toString());
        userI.setIsDeleted(0);
        userI.setCreateBy(userI.getUserName());
        userI.setVersion(0);

        int returnValue=userS.insertUser(userI);
        if(1==returnValue){
            return "用户表插入"+returnType.success.getType();
        }else{
            if(-1==returnValue){
                return "用户表插入"+returnType.repeatFailure.getType();
            }else{
                return "用户表插入"+returnType.failure.getType();
            }
        }
    }

    /**
     * 用户表查询操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 09:12
     */
    @RequestMapping("/queryUser")
    public List<userInfo> queryUser(userInfo userI){
       return userS.queryUser(userI);
    }

    /**
     * 修改用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:36
     */
    @RequestMapping("/modifyUser")
    public String modifyUser(userInfo userI){
        int returnValue=userS.modifyUser(userI);
        if(1==returnValue){
            return "用户表修改"+returnType.success.getType();
        }else{
            return "用户表修改"+returnType.failure.getType();
        }
    }

    /**
     * 删除用户
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:48
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(userInfo userI){
        int returnValue=userS.deleteUser(userI);
        if(1==returnValue){
            return "用户表删除"+returnType.success.getType();
        }else{
            return "用户表删除"+returnType.failure.getType();
        }
    }

    /**
     * 用户角色中间表插入操作
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:35
     */
    @RequestMapping("/insertUserRole")
    public String insertUserRole(userRoleInfo userRoleI){
        userRoleI.setId(UUID.randomUUID().toString());
        userRoleI.setIsDeleted(0);
        userRoleI.setVersion(0);
        userRoleI.setCreateBy(userRoleI.getUserId());

        int returnValue=userS.insertUserRole(userRoleI);
        if(1==returnValue){
            return "用户角色中间表插入"+returnType.success.getType();
        }else{
            if(-1==returnValue){
                return "用户角色中间表插入"+returnType.repeatFailure.getType();
            }else{
                return "用户角色中间表插入"+returnType.failure.getType();
            }
        }
    }

    /**
     * 修改用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:58
     */
    @RequestMapping("/modifyUserRole")
    public String modifyUserRole(userRoleInfo userRoleI){
        int returnValue=userS.modifyUserRole(userRoleI);
        if(1==returnValue){
            return "用户角色中间表修改"+returnType.success.getType();
        }else{
            return "用户角色中间表修改"+returnType.failure.getType();
        }
    }

    /**
     * 删除用户角色中间表
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:04
     */
    @RequestMapping("/deleteUserRole")
    public String deleteUserRole(userRoleInfo userRoleI){
        int returnValue=userS.deleteUserRole(userRoleI);
        if(1==returnValue){
            return "用户角色中间表删除"+returnType.success.getType();
        }else{
            return "用户角色中间表删除"+returnType.failure.getType();
        }
    }

    /**
     * 用户角色中间表查询
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:16
     */
    @RequestMapping("/queryUserRole")
    public List<userRoleInfo> queryUserRole(userRoleInfo userRoleI){
        return userS.queryUserRole(userRoleI);
    }

    /**
     * 新增角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:34
     */
    @RequestMapping("/insertRole")
    public String insertRole(roleInfo roleI){
        roleI.setId(UUID.randomUUID().toString());
        roleI.setIsDeleted(0);
        roleI.setVersion(0);
        roleI.setCreateBy("admin");

        int returnValue=userS.insertRole(roleI);
        if(1==returnValue){
            return "角色表插入"+returnType.success.getType();
        }else{
            if(-1==returnValue){
                return "角色表插入"+returnType.repeatFailure.getType();
            }else{
                return "角色表插入"+returnType.failure.getType();
            }
        }
    }

    /**
     * 修改角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:12
     */
    @RequestMapping("/modifyRole")
    public String modifyRole(roleInfo roleI){
        int returnValue=userS.modifyRole(roleI);
        if(1==returnValue){
            return "角色表修改"+returnType.success.getType();
        }else{
            return "角色表修改"+returnType.failure.getType();
        }
    }

    /**
     * 删除角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 12:18
     */
    @RequestMapping("/deleteRole")
    public String deleteRole(roleInfo roleI){
        int returnValue=userS.deleteRole(roleI);
        if(1==returnValue){
            return "角色表删除"+returnType.success.getType();
        }else{
            return "角色表删除"+returnType.failure.getType();
        }
    }

    /**
     * 角色表查询
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:16
     */
    @RequestMapping("/queryRole")
    public List<roleInfo> queryRole(roleInfo roleI){
        return userS.queryRole(roleI);
    }

    /**
     * 查询数据库中数据条数
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:09
     */
    @RequestMapping("/countUser")
    public int countUser(countUserInfo countUserI){
        countUserI.setTableName("t_sys_user");
        return userS.countUser(countUserI);
    }

    /**
     * 查询所有用户及其对应角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 11:05
     */
    @RequestMapping("/queryAll")
    public List<userInfo> queryRole(){
        return userS.queryAll();
    }
}
