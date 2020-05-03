package com.work.demoofgradle.entity;

/**
 * @Author: SinG
 * @Date: 2020/5/3 13:45
 */
public class RoleInfo {
    private String role;
    private String roletype;

    public String getRole() {
        return role;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "role='" + role + '\'' +
                ", roletype='" + roletype + '\'' +
                '}';
    }
}
