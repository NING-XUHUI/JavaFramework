package com.xatu;

import com.xatu.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public void test01() {
        String config = "ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("myStudent");
        System.out.println("myStudent:" + student);
    }
}
