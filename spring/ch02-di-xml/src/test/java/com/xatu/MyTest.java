package com.xatu;


import com.xatu.ba01.Student;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01() {

        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象：" + myStudent);

        Date myDate = (Date) ac.getBean("mydate");
        System.out.println("MyDate:" + myDate);
    }
}
