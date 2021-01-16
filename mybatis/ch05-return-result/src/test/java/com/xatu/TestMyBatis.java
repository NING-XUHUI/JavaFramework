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
    public void testSelectStudentsById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = dao.selectStudentById(1003);
        System.out.println(student);
        sqlSession.close();
    }


    @Test
    public void testSelectMultiParams() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectMultiParams("李四", 40);

        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectStudentsReturnViewStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        ViewStudent student = dao.selectStudentReturnViewStudent(1005);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public void testCountStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Integer count = dao.countStudent();
        System.out.println("共有" + count + "个人.");
    }
    @Test
    public void testSelectMap() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Map<Object, Object> map = dao.selectedMapById(1001);
        System.out.println(map);
    }
    @Test
    public void testSelectAllStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectAllStudents2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> students = dao.selectMyStudents();
        for (MyStudent student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectAllStudents3() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> students = dao.selectDiffColProperty();
        for (MyStudent student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectLikeOne() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectLikeOne("张%");
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectLikeTwo() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectLikeTwo("张");
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
