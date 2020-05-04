package com.example.springboot_mytest.service;

import com.example.springboot_mytest.dao.UserDao;
import com.example.springboot_mytest.entity.StudentInfo;
import com.example.springboot_mytest.entity.TeacherInfo;
import com.example.springboot_mytest.entity.UserInfo;
import com.example.springboot_mytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wwb
 * @Date: 2020/5/3 0003 14:49
 */
@Service
public class UserService {

    @Autowired
    protected UserDao userDao;

    /*is_members表添加数据*/
    public int insertUser(UserInfo userInfo) {
        String id = userInfo.getId();
        if(null != id){
            String userName = userInfo.getName();
            if(null != userName && !"".equals(userName)) {
                userName += "aaa";
                userInfo.setName(userName);
            }
            return userDao.saveUser(userInfo);
        }else {
            return 0;
        }

    }

    /*is_members表查找数据*/
    public List<UserInfo> selectUser(UserInfo userInfo){
        List<UserInfo> listUserInfo=userDao.listUserInfo(userInfo);
        for(int i=0;i<listUserInfo.size();i++){
            if("0".equals(listUserInfo.get(i).getSex())){
                listUserInfo.get(i).setSex("Man");
            }else{
                listUserInfo.get(i).setSex("Woman");
            }
        }
        return listUserInfo;
//        return userDao.listUserInfo(userInfo);
    }

    /*is_members表修改数据*/
    public int updateUserInfo(UserInfo userInfo){
        return userDao.updateUserInfo(userInfo);
    }

    /*is_members表删除数据*/
    public int deleteUserInfo(UserInfo userInfo){
        return userDao.deleteUserInfo(userInfo);
    }

    /*s_class表添加数据*/
    public int insertStudent(StudentInfo studentInfo) {
        return userDao.saveStudent(studentInfo);
    }

    /*s_class表查找数据*/
    public List<StudentInfo> selectStudent(StudentInfo studentInfo){
        return userDao.listStudentInfo(studentInfo);
    }

    /*s_class表修改数据*/
    public int updateStudentInfo(StudentInfo studentInfo){
        return userDao.updateStudentInfo(studentInfo);
    }

    /*s_class表删除数据*/
    public int deleteStudentInfo(StudentInfo studentInfo){
        return userDao.deleteStudentInfo(studentInfo);
    }

    /*t_class表添加数据*/
    public int insertTeacher(TeacherInfo teacherInfo) {
        return userDao.saveTeacher(teacherInfo);
    }

    /*t_class表查找数据*/
    public List<TeacherInfo> selectTeacher(TeacherInfo teacherInfo){
        return userDao.listTeacherInfo(teacherInfo);
    }

    /*t_class表修改数据*/
    public int updateTeacherInfo(TeacherInfo teacherInfo){
        return userDao.updateTeacherInfo(teacherInfo);
    }

    /*t_class表删除数据*/
    public int deleteTeacherInfo(TeacherInfo teacherInfo){
        return userDao.deleteTeacherInfo(teacherInfo);
    }

}
