package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.domain.MyStudent;
import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import com.xatu.vo.QueryParam;
import com.xatu.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.InterruptedIOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
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
    @Test
    public void testSelectStudentWhere() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("李四");
        student.setAge(18);
        List<Student> students = dao.selectStudentWhere(student);

        for (Student stu : students) {
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectFor() {
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        String sql = "select * from student where id in";
        StringBuilder builder = new StringBuilder();
        int init = 0;
        int len = list.size();


        builder.append("(");
        for(Integer i:list) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println(sql);
    }
    @Test
    public void testSelectStudentForeach() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        List<Student> students = dao.selectStudentForeach(list);

        for (Student stu : students) {
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectStudentForeachTwo() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stuList = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1001);
        stuList.add(s1);
        Student s2 = new Student();
        s2.setId(1003);
        stuList.add(s2);
        List<Student> students = dao.selectStudentForeachTwo(stuList);

        for (Student student:students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
