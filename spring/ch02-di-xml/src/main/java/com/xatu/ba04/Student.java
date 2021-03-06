package com.xatu.ba04;

/**
 * @author ningxuhui
 */
public class Student {
    private String name;
    private int age;


    private School school;


    public void setSchool(School school) {
        this.school = school;
    }

    /**
     * 没有set方法是会报错的
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
