package com.neusoft.springboot_test.entity;

import java.util.Date;

/**
 * @Author: lxc
 * @Date: 2020/05/04 20:51
 */
public class UserRole {
    /**
     * 用户id
     * @author lxc
     * @date 2020-04-30
     */
    private String userId;

    /**
     * 账号
     * @author lxc
     * @date 2020-04-30
     */
    private String userName;

    /**
     * 性别 (0-女 1-男)
     * @author lxc
     * @date 2020-04-30
     */
    private String userSex;

    /**
     * 作废标记（1作废，0未作废）
     * @author lxc
     * @date 2020-04-30
     */
    private Integer isDeleted;

    /**
     * 序号（从0开始）
     * @author lxc
     * @date 2020-04-30
     */
    private String sortNo;

    /**
     * 创建时间
     * @author lxc
     * @date 2020-04-30
     */
    private Date gmtCreate;

    /**
     * 创建者(登录账号)
     * @author lxc
     * @date 2020-04-30
     */
    private String createBy;

    /**
     * 更新时间
     * @author lxc
     * @date 2020-04-30
     */
    private Date gmtModified;

    /**
     * 更新者(登录账号)
     * @author lxc
     * @date 2020-04-30
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @author lxc
     * @date 2020-04-30
     */
    private Integer version;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getSortNo() {
        return sortNo;
    }

    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", isDeleted=" + isDeleted +
                ", sortNo='" + sortNo + '\'' +
                ", qmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModified_by='" + lastModifiedBy + '\'' +
                ", version=" + version +
                '}';
    }
}