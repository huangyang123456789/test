package com.example.demo.controller;

import com.example.demo.entity.RoleInfo;
import com.example.demo.entity.SelectUser;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author:fjh
 * @Date: 11:21
 */
@RestController
@RequestMapping("/role")
public class RoleController{
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;
    /**
     * @author:fjh
     * @Date: 22:54
     * 与前台数据简单交流层
     */
 /**
  * @author:fjh
  * @Date: 22:54
  * 新增角色
  */

    @RequestMapping("/insertRole")
    public int insertUser(RoleInfo roleInfo)
    {
        try {

            roleInfo.setIsDeleted("0");
            roleInfo.setId(UUID.randomUUID().toString());

        }catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        finally {
            return roleService.insertUser(roleInfo);
        }

    }
    @RequestMapping("/updateRole")
    public int updateUser(RoleInfo roleInfo)

    {
        try {


            roleInfo.setCreateBy("老王");
            return roleService.updateUser(roleInfo);

        }catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }


    }
    @RequestMapping("/selectRole")
    public List<SelectUser> selcetUser(SelectUser selectUser)
    {


        return userService.selectUser(selectUser);
    }
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据假删除
     */
    @RequestMapping("/deleteRole")
    public int deleteUser(RoleInfo roleInfo) {
        try {
            roleInfo.setIsDeleted("1");

        }catch (Exception e)
        {
            e.printStackTrace();

        }



        return roleService.deleteUser(roleInfo);
    }
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据真删除
     */
    @RequestMapping("/delUserAll")
    public int delUserAll(RoleInfo roleInfo) {
        return roleService.delUserAll(roleInfo);
    }


}
