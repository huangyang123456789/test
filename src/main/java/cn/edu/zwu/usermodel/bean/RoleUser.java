package cn.edu.zwu.usermodel.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 19:47
 */
@Data
public class RoleUser {
    /**
     * id号
     */
    private int id;
    /**
     * 用户的角色id
     */
    private List<Integer> roleId;
    /**
     * 用户关联id
     */
    private int userId;
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
