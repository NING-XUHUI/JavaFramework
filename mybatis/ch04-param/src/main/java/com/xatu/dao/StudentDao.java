package com.xatu.dao;

import com.xatu.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ningxuhui
 */
public interface StudentDao {
    /**
     * 通过id找学生
     *
     * @param id 学生的id
     * @return 符合id的学生
     */
    public Student selectStudentById(Integer id);

    /**
     * 多个参数：命名参数，在形参定义的前面加入@Param("自定义参数名称")
     */
    /**
     * 多参数查找
     *
     * @param name 姓名
     * @param age  年龄
     * @return 查询结果
     */
    public List<Student> selectMultiParams(@Param("myname") String name,
                                           @Param("myage") Integer age);

    /**
     * 查询所有学生
     * @return 所有的学生
     */
    List<Student> selectAllStudents();
}
