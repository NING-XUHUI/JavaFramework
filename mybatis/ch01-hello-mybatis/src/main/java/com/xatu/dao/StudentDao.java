package com.xatu.dao;


import com.xatu.domain.Student;

import java.util.List;

/**
 * 接口操作Student表
 *
 * @author ningxuhui
 */
public interface StudentDao {
    /**
     * 拿到student对象
     * @return student集合
     */
    public List<Student> selectStudents();

    /**
     * 插入方法
     * @param student 表示要插入的数据
     * @return 表示执行insert操作后 影响数据库的行数
     */
    public int insertStudent(Student student);
}
