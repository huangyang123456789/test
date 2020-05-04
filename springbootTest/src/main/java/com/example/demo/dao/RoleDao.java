package com.example.demo.dao;

import com.example.demo.entity.RoleInfo;
import com.example.demo.entity.SelectUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RoleDao {
    /**
     * 新增用户
     * @author fjh
     * @param
     * @return int
     * @date 2020-04-30
     */
    int saveUser(RoleInfo roleInfo);
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
