package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import com.xatu.vo.QueryParam;
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

        Student student = dao.selectStudentById(1005);
        System.out.println(student);
        sqlSession.close();
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
    public void testSelectMultiObjects() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        QueryParam param = new QueryParam();
        param.setParamName("张三");
        param.setParamAge(28);
        List<Student> students = dao.selectMultiObjects(param);
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiPositions() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectMultiPositions("张三", 20);
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectMultiMap() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Map<String, Object> map = new HashMap<>();
        map.put("myname", "张三");
        map.put("myage", 20);
        List<Student> students = dao.selectMultiMap(map);
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
