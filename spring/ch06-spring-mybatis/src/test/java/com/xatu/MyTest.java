package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.domain.Student;
import com.xatu.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.ListIterator;

/**
 * @author ningxuhui
 */

public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中的对象名称: " + name + "|" + ctx.getBean(name));
        }
    }
    @Test
    public void test02() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的对象
        StudentDao dao = (StudentDao) ctx.getBean("studentDao");
        List<Student> students = dao.selectStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void test03() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        StudentService studentService = (StudentService) ctx.getBean("studentService");
        List<Student> students = studentService.queryStudents();
        // spring和mybatis整合在一起使用，事务是自动提交的，无需执行commit
        for (Object student : students) {
            System.out.println(student);
        }
    }
}
