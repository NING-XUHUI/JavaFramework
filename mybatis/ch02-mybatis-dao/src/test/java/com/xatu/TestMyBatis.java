package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.dao.impl.StudentDaoImpl;
import com.xatu.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectStudents() {
        StudentDao dao = new StudentDaoImpl();
        List<Student> studentList = dao.selectStudents();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    
    @Test
    public void testInsertStudents() {
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setName("关羽");
        student.setId(1006);
        student.setEmail("guanyu@qq.com");
        student.setAge(60);
        int nums = dao.insertStudent(student);
        System.out.println(nums);
    }
}
