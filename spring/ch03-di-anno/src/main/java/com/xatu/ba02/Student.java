package com.xatu.ba02;


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

    public Student() {
        System.out.println("无参数构造");
    }
    @Value("${myname}")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${myage}")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
