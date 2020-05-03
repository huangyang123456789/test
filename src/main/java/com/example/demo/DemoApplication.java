package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    DataSource dataSource;

    @Test
    void  contextLoads(){

    }

    @Test
    public void datasourceTest() throws SQLException{
        System.out.println(this.dataSource);
        System.out.println(dataSource.getConnection());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
