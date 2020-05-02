package cn.edu.zwu.usermodel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.zwu.usermodel.mapper")
@SpringBootApplication
public class UserModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserModelApplication.class, args);
    }

}
