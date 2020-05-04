package com.example.springboot_mytest.entity;

import java.util.Date;

/**
 * @Author: wwb
 * @Date: 2020/4/30 11:34
 */
public class UserInfo {

    /**
     * 数据id
     * @author wwb
     * @date 2020/4/30
     */

    private String id;
    private String name;
    private String sex;
    private Integer type;
    private Integer is_deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                ", is_deleted='" + is_deleted + '\'' +
                '}';
    }

}
