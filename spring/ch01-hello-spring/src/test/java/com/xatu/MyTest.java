package com.xatu;

import com.xatu.Service.SomeService;
import com.xatu.Service.impl.SomeServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.dosome();
    }


    /**
     * spring默认创建对象的时间：在创建spring容器时，就创建配置文件中所有的对象
     * spring创建对象：默认调用无参数构造方法
     */
    @Test
    public void test02() {
        //使用spring容器创建的对象
        //1 指定spring配置文件的名称
        String config = "beans.xml";
        //2 创建表示spring容器中的对象， ApplicationContext
        // ApplicationContext就是表示spring容器，通过容器获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //3 从容器中获取某个对象，调用对象的方法
        // getBean("配置文件中bean的id值")
        //SomeService service = (SomeServiceImpl) ac.getBean("someService");

        // 使用spring创建好的对象
        //service.dosome();

    }

    /**
     * 获取spring容器中java对象的信息
     */

    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中对象的数量: " + nums);
        //容器中每个对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * 获取一个非自定义类的对象
     */
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 使用getBean
        Date my = (Date) ac.getBean("mydate");
        System.out.printf("Date:" + my);
    }
}
