package com.xatu.ba07;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author ningxuhui
 */
@Component("myStudent")
public class Student {
    /**
     * 引用类型
     *
     * @Resource： 来自jdk中的注解，spring框架提供了对这个注解功能的支持，可以使用它给引用类型赋值
     *              使用的也是自动注入原理，支持byName，byType，默认是byName
     * 位置：1 在属性定义上面
     *      2 在set方法上面
     *
     * 默认是byName，先使用byname注入，如果失败，就使用byType
     * @Resource 只想使用byName 需要加一个属性name
     * name的值是id
     */
    @Resource(name = "mySchool")
    private School school;


    private String name;
    private Integer age;



    public Student() {
        System.out.println("无参数构造");
    }

    @Value("张飞")
    public void setName(String name) {
        this.name = name;
    }

    @Value("29")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
