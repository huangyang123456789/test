package com.neusoft.stage_work.entity;

/**
 * 查询用户数据表条数
 * @Author: ZEYGK
 * @Date: 2020/05/03 03:42
 */
public class countUserInfo {

    /**
     * 条数
     * @Author: ZEYGK
     * @Date: 2020/05/03 03:44
     */
    private Integer count;

    /**
     * 数据表名称
     * @Author: ZEYGK
     * @Date: 2020/05/03 07:10
     */
    private String tableName;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
