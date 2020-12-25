package com.xatu.ba04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author ningxuhui
 */
@Component("myStudent")
public class Student {
    /**
     * @value 简单类型赋值
     * 属性：value是spring类型的，表示简单类型的属性值
     * 位置：1 在属性定义的上面，无需set方法，推荐使用
     * 2 在set方法上面
     */

    private String name;
    private Integer age;
    /**
     * 引用类型
     *
     * @Autowired: spring框架提供的注解，实现引用类型的赋值
     * spring中使用自动注入的原理，支持byName，byType
     * 默认使用的是byType自动注入
     * <p>
     * 位置：1 在属性定义上面，无需set
     * 2 在set方法上面
     * <p>
     * 如果使用byName
     * 1 在属性上面加@Autowired
     * 2 在属性上面加@Qualifier(value="id")
     */
    @Autowired
    @Qualifier("mySchool")
    private School school;

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
