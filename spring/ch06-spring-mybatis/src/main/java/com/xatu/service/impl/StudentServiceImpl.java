package com.xatu.service.impl;

import com.xatu.dao.StudentDao;
import com.xatu.domain.Student;
import com.xatu.service.StudentService;

import java.util.List;

/**
 * @author ningxuhui
 */

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.selectStudents();
    }
}
