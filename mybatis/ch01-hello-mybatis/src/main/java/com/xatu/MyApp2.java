package com.xatu;


import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author ningxuhui
 */
public class MyApp2 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        String sqlId = "com.xatu.dao.StudentDao.selectStudents";
        List<Student> studentList = sqlSession.selectList(sqlId);

        for (Student student : studentList) {
            System.out.println("查询的学生：" + student);
        }

        sqlSession.close();
    }
}
