package com.work.demoofgradle.controller;

import com.work.demoofgradle.dao.UserDao;
import com.work.demoofgradle.entity.ReturnType;
import com.work.demoofgradle.entity.UserInfo;
import com.work.demoofgradle.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.security.PublicKey;
import java.util.List;
import java.util.logging.Logger;


/**
 * @Author: SinG
 * @Date: 2020/5/2 15:39
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public String insertUser(UserInfo userInfo){
        try {
            userInfo.setIsDeleted(0);
            int t = userService.insertUser(userInfo);
            System.out.println("T:"+t);
            if(0 == t){
                return "新增用户"+ ReturnType.failure.getType();
            }
            else {
                return "新增用户"+ReturnType.Success.getType();
            }
        }catch (Exception ex){
            return "事务回滚了";
        }finally {
            return "结束";
        }
    }
    @RequestMapping("/findUser")
    public List<UserInfo> findUserById(UserInfo userInfo){
        return userService.findUserById(userInfo);
//        String resource = "mybatis/mybatis-config.xml";
//        InputStream inputStream;
//        SqlSession sqlSession=null;
//        Logger logger = Logger.getLogger("com.work.demo.dao.UserDao");
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//            sqlSession = sqlSessionFactory.openSession();
//            UserInfo userInfo = sqlSession.getMapper(UserDao.class).findUserById("2017010440");
//            logger.info("user的名字是"+userInfo.getRname());
//        }catch (Exception e){
//            e.printStackTrace();
//            logger.info("事务回滚了");
//        }finally {
//            logger.info("end");
//        }
    }
    @RequestMapping("/deletUser")
    public int updateUserById(UserInfo userInfo) {
        userInfo.setRid("2017010440");
        return userService.updateUserById(userInfo);
    }
//    @RequestMapping("/rolefind")
//    public List<UserInfo> findRole(UserInfo userInfo){
//        return userService.findRole(userInfo);
//    }
}
