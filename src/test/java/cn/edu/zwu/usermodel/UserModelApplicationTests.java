package cn.edu.zwu.usermodel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class UserModelApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource);
    }

}
