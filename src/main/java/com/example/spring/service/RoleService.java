package com.example.spring.service;

import com.example.spring.entity.RoleInfo;
import com.example.spring.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    int insertRole(RoleInfo roleInfo);
    List listRole(RoleInfo roleInfo);
    int updateRole(RoleInfo roleInfo);
    int deleteRole(RoleInfo roleInfo);
    int deleteReRole(RoleInfo roleInfo);
}
