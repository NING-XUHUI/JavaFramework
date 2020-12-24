package com.xatu.dao.impl;

import com.xatu.dao.StudentDao;
import com.xatu.domain.Student;
import com.xatu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author ningxuhui
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectStudents() {
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.xatu.dao.StudentDao.selectStudents";
        //执行sql语句，使用SqlSession类的方法
        List<Student> students = sqlSession.selectList(sqlId);
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.xatu.dao.StudentDao.insertStudent";
        int nums = sqlSession.insert(sqlId, student);
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
}
