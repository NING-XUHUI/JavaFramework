package com.xatu;

import com.xatu.ba02.School;
import com.xatu.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01() {
        System.out.println("=========test01=========");
        Student student = new Student();
        student.setName("lisi");
        student.setAge(20);

        School school = new School();
        school.setName("dljd");
        school.setAddress("bj");

        student.setSchool(school);
        System.out.println("student:" + student);
    }

    @Test
    public void test02() {
        System.out.println("==========test02==========");
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象:" + myStudent);
    }
}
