package com.neusoft.springboot_test.entity;

import java.util.Date;

/**
 * @Author: lxc
 * @Date: 2020/05/01 17:03
 */
public class UserInfo {
    /**
     * 数据id
     * @author lxc
     * @date 2020-04-30
     */
    private String id;

    /**
     * 账号
     * @author lxc
     * @date 2020-04-30
     */
    private String userAcct;

    /**
     * 用户姓名
     * @author lxc
     * @date 2020-04-30
     */
    private String userName;

    /**
     * 性别 (0-女 1-男)
     * @author lxc
     * @date 2020-04-30
     */
    private String sex;

    /**
     * 电话
     * @author lxc
     * @date 2020-04-30
     */
    private String phone;

    /**
     * 邮箱
     * @author lxc
     * @date 2020-04-30
     */
    private String email;

    /**
     * 身份证
     * @author lxc
     * @date 2020-04-30
     */
    private String idCard;

    /**
     * 作废标记（1作废，0未作废）
     * @author lxc
     * @date 2020-04-30
     */
    private int isDeleted;

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

    /**
     * 密码
     * @author lxc
     * @date 2020-04-30
     */
    private String userPwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
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

    public void setGmtCreate(Date qmtCreate) {
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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", userAcct='" + userAcct + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", sortNo='" + sortNo + '\'' +
                ", qmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModified_by='" + lastModifiedBy + '\'' +
                ", version=" + version +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}

