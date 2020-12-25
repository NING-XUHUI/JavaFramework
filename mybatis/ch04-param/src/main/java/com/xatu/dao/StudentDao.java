package com.xatu.dao;

import com.xatu.domain.Student;

import java.util.List;

/**
 * @author ningxuhui
 */
public interface StudentDao {
    /**
     * 查询学生
     * @return 学生集合
     */
    List<Student> selectStudents();

    /**
     * 插入一个学生信息
     * @param student 学生对象
     * @return 表中共产生多少行的变化
     */
    int insertStudent(Student student);
}
