package com.xatu.service;

import com.xatu.domain.Student;

import java.util.List;

/**
 * @author ningxuhui
 */
public interface StudentService {
    /**
     * service接口：添加学生
     *
     * @param student 添加的学生
     * @return 影响的行数
     */
    int addStudent(Student student);

    /**
     * service接口：查询所有学生
     *
     * @return 查询到的学生列表
     */
    List<Student> queryStudents();
}
