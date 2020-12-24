package com.xatu;

import com.xatu.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println("myStudent:" + myStudent);

    }

    @Test
    public void test02() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        File myFile = (File) ac.getBean("myfile");
        System.out.println(myFile.getName());

    }
}
