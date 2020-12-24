package com.xatu;

import com.xatu.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ningxuhui
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        // 访问mybatis读取student数据
        // 1 定义mybatis主配置文件的名称，从类路径开始
        String config = "mybatis.xml";
        // 2 读取这个config文件
        InputStream in = Resources.getResourceAsStream(config);
        // 3 创建了SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 4 创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        // 5 【重要】获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 6 指定要执行的sql语句的标识 sql映射文件中的namespace + "。" + 标签的id值
        String sqlId = "com.xatu.dao.StudentDao" + "." + "selectStudents";
        // 7 执行sql语句，通过sqlId找到语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        // 8 输出结果
        studentList.forEach(student -> System.out.println("查询的学生" + student));
        // 9 关闭SqlSession对象
        sqlSession.close();

    }
}
