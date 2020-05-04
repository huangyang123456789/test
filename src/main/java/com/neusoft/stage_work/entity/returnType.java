package com.neusoft.stage_work.entity;

/**
 * 枚举类
 * @Author: ZEYGK
 * @Date: 2020/05/03 07:28
 */
public enum returnType {
    success("成功"),
    failure("失败"),
    nullPointerFailure("空指针错误"),
    illegalArgumentFailure("参数类型错误"),
    SQLFailure("数据库访问错误"),
    unknownFailure("未知错误"),
    SQLSyntaxErrorFailure("SQL语句语法错误"),
    repeatFailure("数据重复"),
    ;

    private  String type;
    returnType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
