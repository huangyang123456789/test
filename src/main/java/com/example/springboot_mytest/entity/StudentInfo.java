package com.example.springboot_mytest.entity;

/**
 * @Author: wwb
 * @Date: 2020/5/4 0004 15:09
 */
public class StudentInfo {

    private Integer s_id;
    private Integer student_id;
    private String s_class;
    private Integer s_deleted;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getS_class() {
        return s_class;
    }

    public void setS_class(String s_class) {
        this.s_class = s_class;
    }

    public Integer getS_deleted() {
        return s_deleted;
    }

    public void setS_deleted(Integer s_deleted) {
        this.s_deleted = s_deleted;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "s_id='" + s_id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", s_class='" + s_class + '\'' +
                ", s_deleted='" + s_deleted + '\'' +
                '}';
    }


}
