package com.xatu.dao;

import com.xatu.domain.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 插入一个学生
     *
     * @param student 插入的学生
     * @return 影响了几行
     */
    int insertStudent(Student student);

    /**
     * 查询学生
     *
     * @return 查询到的学生列表
     */
    List<Student> selectStudents();
}
