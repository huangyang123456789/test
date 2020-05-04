package com.example.demo.entity;

/**
 * @Author: xiaoming
 * @Date: 2020/5/4 0004 14:46
 */
public enum ReturnType {
    Success("成功"),
    failure("失败");

    private String type;
    ReturnType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
