package cn.edu.zwu.usermodel.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: yjf
 * @Description:
 * @Date: 2020/4/30 16:02
 */
@Data
public class User {
    /**
     * id
     */
    private int id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 用手机号
     */
    private String  phoneNum;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 用户密码
     */
    private String password;
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
    /**
     * 用户的角色列表
     */
    private List<Role> roles;
}
