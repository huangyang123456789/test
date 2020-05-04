package com.springtest.springboot_test.controller;

import com.springtest.springboot_test.entity.UserInfo;
import com.springtest.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: cny
 * @Date: 2020/4/30 14:05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    /**
     * 新增用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/4/30
     */

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        //对参数进行一些简单处理
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }
    
    /**
     * 查询
     * @author cny
      * @param userInfo 
     * @return java.util.List<com.springtest.springboot_test.entity.UserInfo>
     * @date 2020/5/4
     */
    @RequestMapping("/select")
    public List<UserInfo> selectUser(UserInfo userInfo) {
        return userService.selectUser(userInfo);
    }

    /**
     * 修改用户
     * @author cny
      * @param userInfo 
     * @return int
     * @date 2020/5/4
     */
    @RequestMapping("/update")
    public int updateUser(UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

    /**
     * 删除用户
     * @author cny
     * @param userInfo
     * @return int
     * @date 2020/5/4
     */
    @RequestMapping("/delete")
    public int deleteUser(UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }
}
