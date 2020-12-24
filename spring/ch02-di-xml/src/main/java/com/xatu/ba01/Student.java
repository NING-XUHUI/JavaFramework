package com.xatu.ba01;

/**
 * @author ningxuhui
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("spring会调用类的无参数构造方法");
    }

    /**
     * 没有set方法是会报错的
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println("setEmail:" + email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
