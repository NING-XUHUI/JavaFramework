package com.xatu.ba01;


import org.springframework.stereotype.Component;

/**
 * @author ningxuhui
 * @Component 创建对象的，等同于<bean>的功能
 * 属性：value就是对象的名称，也就是bean的id值
 * value的值是唯一的，创建的对象在整个spring容器中就一个
 * 位置：在类的上面
 * @Component(value = "myStudent")
 * 等同于
 * <bean id="myStudent" class="com.xatu.ba01.Student"></bean>
 * 使用value属性，指定对象名称
 * @Component(value = "myStudent")
 * 省略value
 * @Component("myStudent") 不指定对象名称，由spring提供默认名称:首字母小写的名称
 * @Component spring中和@component功能一致，创建对象的注解还有：
 * 1 @Repository(用在持久层类的上面)：放在Dao的实现类上面，
 * 表示创建Dao对象，dao对象就是能访问数据库的
 * 2 @Service(用在业务层类上)：放在service的实现类上面
 * 创建service对象，service对象是做业务处理，可以有事务等功能的
 * 3 @Controller(用在控制器上面)：放在控制器（处理器）类上面，
 * 创建控制器对象，能够接受用户提交的参数，显示请求的处理结果
 * <p>
 * 以上三个注解的使用方法和component对象，都能创建对象，但是这三个注解还有额外功能。
 * 用来给项目分层的
 */
@Component("myStudent")
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
