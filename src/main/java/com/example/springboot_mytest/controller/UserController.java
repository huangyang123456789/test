package com.example.springboot_mytest.controller;

import com.example.springboot_mytest.entity.StudentInfo;
import com.example.springboot_mytest.entity.TeacherInfo;
import com.example.springboot_mytest.entity.UserInfo;
import com.example.springboot_mytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Author: wwb
 * @Date: 2020/5/3 0003 16:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*is_members表添加数据*/
    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        return userService.insertUser(userInfo);
    }

    /*is_members表查找数据*/
    @RequestMapping("/selectUser")
    public List<UserInfo> selectUser(UserInfo userInfo){
        return userService.selectUser(userInfo);
    }

    /*is_members表修改数据*/
    @RequestMapping("/updateUser")
    public int updateUserInfo(UserInfo userInfo){
        return userService.updateUserInfo(userInfo);
    }

    /*is_members表删除数据*/
    @RequestMapping("/deleteUser")
    public int deleteUserInfo(UserInfo userInfo){
        return userService.deleteUserInfo(userInfo);
    }

    /*s_class表添加数据*/
    @RequestMapping("/insertStudent")
    public int insertStudent(StudentInfo studentInfo){
        return userService.insertStudent(studentInfo);
    }

    /*s_class表查找数据*/
    @RequestMapping("/selectStudent")
    public List<StudentInfo> selectStudent(StudentInfo studentInfo){
        return userService.selectStudent(studentInfo);
    }

    /*s_class表修改数据*/
    @RequestMapping("/updateStudent")
    public int updateStudentInfo(StudentInfo studentInfo){
        return userService.updateStudentInfo(studentInfo);
    }

    /*s_class表删除数据*/
    @RequestMapping("/deleteStudent")
    public int deleteStudentInfo(StudentInfo studentInfo){
        return userService.deleteStudentInfo(studentInfo);
    }

    /*t_class表添加数据*/
    @RequestMapping("/insertTeacher")
    public int insertTeacher(TeacherInfo teacherInfo){
        return userService.insertTeacher(teacherInfo);
    }

    /*t_class表查找数据*/
    @RequestMapping("/selectTeacher")
    public List<TeacherInfo> selectTeacher(TeacherInfo teacherInfo){
        return userService.selectTeacher(teacherInfo);
    }

    /*t_class表修改数据*/
    @RequestMapping("/updateTeacher")
    public int updateTeacherInfo(TeacherInfo teacherInfo){
        return userService.updateTeacherInfo(teacherInfo);
    }

    /*t_class表删除数据*/
    @RequestMapping("/deleteTeacher")
    public int deleteTeacherInfo(TeacherInfo teacherInfo){
        return userService.deleteTeacherInfo(teacherInfo);
    }
}
