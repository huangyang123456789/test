package com.springtest.springboot_test.entity;

import java.util.Date;

/**
 * @Author: cny
 * @Date: 2020/4/30 11:37
 */
public class UserInfo {
    /**
     * 数据id
     * @author cny
     * @date 2020/4/30
     */
    private String id;

    /**
     * 账号
     * @author cny
     * @date 2020/4/30
     */
    private String userAcct;

    /**
     * 用户姓名
     * @author cny
     * @date 2020/4/30
     */
    private String userName;

    /**
     *性别
     * @author cny
     * @date 2020/4/30
     */
    private String sex;

    /**
     *手机号
     * @author cny
     * @date 2020/4/30
     */
    private String phone;

    /**
     *邮箱
     * @author cny
     * @date 2020/4/30
     */
    private String email;

    /**
     *身份证号
     * @author cny
     * @date 2020/4/30
     */
    private String idCard;

    /**
     *是否废除
     * @author cny
     * @date 2020/4/30
     */
    private Integer isDeleted;

    /**
     *序号
     * @author cny
     * @date 2020/4/30
     */
    private String sortNo;

    /**
     *创建时间
     * @author cny
     * @date 2020/4/30
     */
    private Date gmtCreate;

    /**
     *创建者
     * @author cny
     * @date 2020/4/30
     */
    private String createBy;

    /**
     *修改时间
     * @author cny
     * @date 2020/4/30
     */
    private Date gmtModified;

    /**
     *修改者
     * @author cny
     * @date 2020/4/30
     */
    private String lastModifiedBy;

    /**
     *版本号
     * @author cny
     * @date 2020/4/30
     */
    private Integer version;

    /**
     *密码
     * @author cny
     * @date 2020/4/30
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
                ", isDeleted=" + isDeleted +
                ", sortNo='" + sortNo + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
