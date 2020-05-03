package com.work.demoofgradle.entity;

/**
 * @Author: SinG
 * @Date: 2020/5/2 15:55
 */
public class UserInfo {
    /**
     * 数据
     * @Author: SinG
     * @Date: 2020/5/2 15:55
     */
    private String rid;
    private String role;
    private String rname;
    private String rsex;
    private Integer isDeleted;

    public String getRid() {
        return rid;
    }

    public String getRole() {
        return role;
    }

    public String getRname() {
        return rname;
    }

    public String getRsex() {
        return rsex;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public void setRsex(String rsex) {
        this.rsex = rsex;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "rid='" + rid + '\'' +
                ", role='" + role + '\'' +
                ", rname='" + rname + '\'' +
                ", rsex='" + rsex + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}
