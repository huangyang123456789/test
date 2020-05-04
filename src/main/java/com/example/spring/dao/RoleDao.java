package com.example.spring.dao;

import com.example.spring.entity.RoleInfo;
import com.example.spring.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author: szc
 * @Date: 2020/5/4 11:08
 */
@Repository
@Mapper
public interface RoleDao {
    /**
     * 新增角色
     * @Author: szc
     * param roleInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int saveRole(RoleInfo roleInfo);

    /**
     * 查找角色
     * @Author: szc
     * param roleInfo
     * @return list
     * @Date: 2020/4/30 15:08
     */
    List<RoleInfo>listRoleInfo(RoleInfo roleInfo);
    /**
     * 修改
     * @Author: szc
     * param roleInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int updateRole(RoleInfo roleInfo);
    /**
     * 假删除
     * @Author: szc
     * param roleInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int deleteRole(RoleInfo roleInfo);
    /**
     * 真删除
     * @Author: szc
     * param roleInfo
     * @return int
     * @Date: 2020/4/30 15:08
     */
    int deleteReRole(RoleInfo roleInfo);
}