package com.xatu.ba01;


import org.springframework.stereotype.Component;

/**
 * @author ningxuhui
 * @Component 创建对象的，等同于<bean>的功能
 *              属性：value就是对象的名称，也就是bean的id值
 *                  value的值是唯一的，创建的对象在整个spring容器中就一个
 *              位置：在类的上面
 *
 *              @Component(value = "myStudent")
 *              等同于
 *              <bean id="myStudent" class="com.xatu.ba01.Student"></bean>
 */
@Component(value = "myStudent")
public class Student {
    private String name;
    private Integer age;
    public Student() {
        System.out.println("无参数构造");
    }

    public void setName(String name) {
        this.name = name;
    }

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
