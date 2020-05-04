package com.example.demo.service;

import com.example.demo.entity.RoleInfo;
import com.example.demo.entity.SelectUser;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService {
    /**
     * 新增用户
     * @author wwb
     * @param roleInfo
     * @return int
     * @date 2020-04-30
     */
    int insertUser(RoleInfo roleInfo);
    int updateUser(RoleInfo roleInfo);
    List<SelectUser> selectUser(SelectUser selectUser);
    /**
     * @author:fjh
     * @Date: 22:55
     * 数据假删除
     */
    int  deleteUser(RoleInfo roleInfo);
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据真删除
     */
    int delUserAll(RoleInfo roleInfo);
}
