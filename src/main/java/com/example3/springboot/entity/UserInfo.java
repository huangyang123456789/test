package com.example3.springboot.entity;

import java.util.Date;

/**
 * @Author: wwb
 * @Date: 2020/4/30 11:34
 */
public class UserInfo {

    /**
     * 数据id
     * @author wwb
     * @date 2020/4/30
     */
    private String id;

    /**
     * 账号
     * @author wwb
     * @date 2020/4/30
     */
    private String useracct;
    private String position;
    private String username;

    private String sex;


    private Integer isDeleted;


    private Date gmtCreate;

    private String createBy;

    private Date gmtModified;

    private String lastModifiedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuseracct() {
        return useracct;
    }

    public void setuseracct(String useracct) {
        this.useracct = useracct;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }



    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", useracct='" + useracct + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}
