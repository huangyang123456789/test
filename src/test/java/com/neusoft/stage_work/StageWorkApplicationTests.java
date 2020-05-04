package com.neusoft.stage_work;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class StageWorkApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }

    /**
     * @Author: ZEYGK
     * @Date: 2020/05/02 03:01
     * 数据库连接测试
     */
    @Test
    public void datasourceTest() throws SQLException {
        System.out.println(this.dataSource);
//        System.out.println(dataSource.getConnection());
    }
}
