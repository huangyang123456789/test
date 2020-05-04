package com.neusoft.stage_work.entity;

import java.util.Date;

/**
 * 用户角色中间表
 * @Author: ZEYGK
 * @Date: 2020/05/04 07:36
 */
public class userRoleInfo {

    /**
     * 数据id
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:37
     */
    private String id;

    /**
     * 用户id
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:38
     */
    private String userId;

    /**
     * 角色id
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:38
     */
    private String roleId;

    /**
     * 是否被删除
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:39
     */
    private Integer isDeleted;

    /**
     * 序号
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:39
     */
    private Integer sortNo;

    /**
     * 创建时间
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:40
     */
    private Date gmtCreate;

    /**
     * 创建者
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:41
     */
    private String createBy;

    /**
     * 修改时间
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:41
     */
    private Date gmtModified;

    /**
     * 修改者
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:42
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @Author: ZEYGK
     * @Date: 2020/05/04 07:42
     */
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

    @Override
    public String toString() {
        return "userRoleInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
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
