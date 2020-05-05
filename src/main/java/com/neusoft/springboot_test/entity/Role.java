package com.neusoft.springboot_test.entity;

import java.util.Date;

/**
 * @Author: lxc
 * @Date: 2020/05/04 21:18
 */
public class Role {
    /**
     * 角色id
     * @author lxc
     * @date 2020-04-30
     */
    private Integer roleId;

    /**
     * 角色姓名
     * @author lxc
     * @date 2020-04-30
     */
    private String roleName;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", isDeleted=" + isDeleted +
                ", sortNo='" + sortNo + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                '}';
    }
}