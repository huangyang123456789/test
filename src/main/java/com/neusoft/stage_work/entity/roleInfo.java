package com.neusoft.stage_work.entity;

import java.util.Date;

/**
 * 角色管理
 * @Author: ZEYGK
 * @Date: 2020/05/04 10:07
 */
public class roleInfo {

    /**
     * 数据id
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:08
     */
    private String id;

    /**
     * 角色名字
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:08
     */
    private String roleName;

    /**
     * 是否被删除
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:08
     */
    private Integer isDeleted;

    /**
     * 序号
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:09
     */
    private Integer sortNo;

    /**
     * 创建时间
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:09
     */
    private Date gmtCreate;

    /**
     * 创建者
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:10
     */
    private String createBy;

    /**
     * 修改时间
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:10
     */
    private Date gmtModified;

    /**
     * 修改者
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:11
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @Author: ZEYGK
     * @Date: 2020/05/04 10:11
     */
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "roleInfo{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
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
