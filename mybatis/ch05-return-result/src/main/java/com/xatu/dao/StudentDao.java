package com.xatu.dao;

import com.xatu.domain.MyStudent;
import com.xatu.domain.Student;
import com.xatu.vo.QueryParam;
import com.xatu.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    public Student selectStudentById(@Param("studentId") Integer id);

    /**
     * 多参数查找
     *
     * @param name 姓名
     * @param age  年龄
     * @return 查询结果
     */
    List<Student> selectMultiParams(@Param("myname") String name,
                                    @Param("myage") Integer age);

    /**
     * 选择学生
     *
     * @param id 查询的id
     * @return 学生
     */
    ViewStudent selectStudentReturnViewStudent(@Param("sid") Integer id);

    int countStudent();

    /**
     * 定义方法返回Map
     * @param id id
     * @return map
     */
    Map<Object, Object> selectedMapById(Integer id);

    /**
     * 使用resultMap对应映射关系
     * @return None
     */
    List<Student> selectAllStudents();

    /**
     * .
     * @return .
     */
    List<MyStudent> selectMyStudents();

    /**
     * .
     * @return .
     */
    List<MyStudent> selectDiffColProperty();

    /**
     * 第一种模糊查询
     * 在java代码中来指定like的内容
     * @return List
     */
    List<Student> selectLikeOne(String name);

    /**
     *
     * @return List
     */
    List<Student> selectLikeTwo(String name);


}
