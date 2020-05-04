package com.example.springboot_mytest.entity;

/**
 * @Author: wwb
 * @Date: 2020/5/4 0004 16:15
 */
public class TeacherInfo {
    private Integer t_id;
    private String t_class;
    private Integer teacher_id;
    private Integer t_deleted;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_class() {
        return t_class;
    }

    public void setT_class(String t_class) {
        this.t_class = t_class;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getT_deleted() {
        return t_deleted;
    }

    public void setT_deleted(Integer t_deleted) {
        this.t_deleted = t_deleted;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "t_id='" + t_id + '\'' +
                ", t_class='" + t_class + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", t_deleted='" + t_deleted + '\'' +
                '}';
    }
}
