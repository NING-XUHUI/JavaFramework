package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.domain.MyStudent;
import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import com.xatu.vo.QueryParam;
import com.xatu.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMyBatis {
    @Test
    public void testSelectStudentIf() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("李四");
        student.setAge(18);
        List<Student> students = dao.selectStudentIf(student);

        for (Student stu : students) {
            System.out.println(stu);
        }
        sqlSession.close();
    }

}
