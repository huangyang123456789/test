package com.neusoft.stage_work.entity;

import java.util.Date;

/**
 * 用户管理
 * @Author: ZEYGK
 * @Date: 2020/05/02 08:04
 */
public class userInfo {
    /**
     * 数据id
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:17
     */
    private String id;

    /**
     * 用户账号
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:17
     */
    private String account;

    /**
     * 用户名
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:18
     */
    private String userName;

    /**
     * 性别
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:19
     */
    private String sex;

    /**
     * 手机号
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:19
     */
    private String phone;

    /**
     * 电子邮箱
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:20
     */
    private String email;

    /**
     * 身份证号
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:20
     */
    private String idCard;

    /**
     * 密码
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:21
     */
    private String pwd;

    /**
     * 查询用户对应角色时存放角色
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:56
     */
    private String roleName;

    /**
     * 是否删除
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:26
     */
    private Integer isDeleted;

    /**
     * 序号
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:26
     */
    private Integer sortNo;

    /**
     * 创建时间
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:26
     */
    private Date gmtCreate;

    /**
     * 创建者
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:27
     */
    private String createBy;

    /**
     * 修改时间
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:32
     */
    private Date gmtModified;

    /**
     * 修改者
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:32
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @Author: ZEYGK
     * @Date: 2020/05/02 08:33
     */
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "userInfo{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", pwd='" + pwd + '\'' +
                ", isDeleted=" + isDeleted +
                ", sortNo=" + sortNo +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                '}';
    }
}
