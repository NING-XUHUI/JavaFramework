package com.xatu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ningxuhui
 */

public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        String names[] = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
