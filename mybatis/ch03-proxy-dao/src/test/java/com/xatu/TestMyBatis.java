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
        /*
          1.dao对象，类型是StudentDao，全限定名称是com.xatu.dao.StudentDao

          2.方法名称，selectStudents,这个方法就是mapper文件中的id值

          3.通过dao中的方法的返回值也可以确定MyBatis要调用的SqlSession方法
           如果返回值是List， 调用SqlSession.selectList()方法
           会调用对应的方法

           mybatis的动态代理：mybatis根据dao的方法调用，获取执行sql语句的信息
           mybatis根据你的dao接口，创建出一个dao接口的实现类，并创建这个类的对象
           完成SqlSession调用方法，访问数据库
         */
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
