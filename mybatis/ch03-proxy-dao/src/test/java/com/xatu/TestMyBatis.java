package com.xatu;

import com.xatu.dao.StudentDao;
import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectStudents() {
        /*
         *  使用mybatis动态代理机制，使用SqlSession.getMapper方法
         *  getMapper能获取dao接口对应的实现类对象
         * */

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        // 调用dao方法，执行数据库操作
        List<Student> students = dao.selectStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testInsertStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("刘备");
        student.setId(1007);
        student.setEmail("liubei@baidu.com");
        student.setAge(48);
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        sqlSession.close();
    }
}
