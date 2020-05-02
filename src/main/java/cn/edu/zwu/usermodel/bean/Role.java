package cn.edu.zwu.usermodel.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author: yjf
 * @Description: 角色实体类
 * @Date: 2020/4/30 16:19
 */
@Data
public class Role {
    /**
     * id
     */
    private int id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 排序号
     */
    private int sortNo;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 修改人
     */
    private String lastModifiedBy;
    /**
     * 版本号
     */
    private int version;
    /**
     * 是否删除     */
    private int isDeleted;
}
