package com.example.springboot_mytest.dao;

import com.example.springboot_mytest.entity.StudentInfo;
import com.example.springboot_mytest.entity.TeacherInfo;
import com.example.springboot_mytest.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wwb
 * @Date: 2020/5/2 0002 20:56
 */
@Repository
@Mapper
public interface UserDao {

    /*is_members表添加数据*/
    int saveUser(UserInfo userInfo);

    /*is_members表查找数据*/
    List<UserInfo> listUserInfo(UserInfo userInfo);

    /*is_members表修改数据*/
    int updateUserInfo(UserInfo userInfo);

    /*is_members表删除数据*/
    int deleteUserInfo(UserInfo userInfo);

    /*s_class表添加数据*/
    int saveStudent(StudentInfo studentInfo);

    /*s_class表查找数据*/
    List<StudentInfo> listStudentInfo(StudentInfo studentInfo);

    /*s_class表修改数据*/
    int updateStudentInfo(StudentInfo studentInfo);

    /*s_class表删除数据*/
    int deleteStudentInfo(StudentInfo studentInfo);

    /*t_class表添加数据*/
    int saveTeacher(TeacherInfo teacherInfo);

    /*t_class表查找数据*/
    List<TeacherInfo> listTeacherInfo(TeacherInfo teacherInfo);

    /*t_class表修改数据*/
    int updateTeacherInfo(TeacherInfo teacherInfo);

    /*t_class表删除数据*/
    int deleteTeacherInfo(TeacherInfo teacherInfo);
}
