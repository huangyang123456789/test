package com.neusoft.springboot_test.entity;

/**
 * @Author: lxc
 * @Date: 2020/05/04 20:59
 */
public enum Enumclass {
    Success("成功"),
    failure("失败");

    private String type;
    Enumclass(String type) {
        this.type = type;
    }

    public String getEnum() {
        return type;
    }

    public void setEnum(String type) {
        this.type = type;
    }
}