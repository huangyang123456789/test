package com.neusoft.springboot_test.entity;

/**
 * @Author: nxw
 * @Date: 2020/5/2 21:32
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
