package com.xatu;

import com.xatu.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {
    @Test
    public void test01() {
        String config = "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("myStudent:" + myStudent);
    }
}
