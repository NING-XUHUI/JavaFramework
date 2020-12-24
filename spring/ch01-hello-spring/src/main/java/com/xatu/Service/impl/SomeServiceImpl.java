package com.xatu.Service.impl;

import com.xatu.Service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ningxuhui
 */
public class SomeServiceImpl implements SomeService {
//    public SomeServiceImpl() {
//        System.out.println("执行了SomeServiceImpl的无参数构造方法");
//    }

    @Override
    public void dosome() {
        System.out.println("执行了SomeService中的dosome方法");
    }

    public static void main(String[] args) {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        SomeService mys = (SomeServiceImpl) ac.getBean("someService");
        mys.dosome();
    }
}
