package com.xatu.dao;

import com.xatu.domain.Student;

import java.util.List;

/**
 * @author ningxuhui
 */
public interface StudentDao {
    /**
     * 通过id找学生
     * @param id 学生的id
     * @return 符合id的学生
     */
    public Student selectStudentById(Integer id);
}
