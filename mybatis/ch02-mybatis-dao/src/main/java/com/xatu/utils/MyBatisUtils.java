package com.xatu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ningxuhui
 */
public class MyBatisUtils {

    private static SqlSessionFactory factory = null;
    static {
        // 需要和你项目中的文件名一致
        String config = "mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            // 创建SqlSessionFactory对象，使用SqlSessionFactoryBuilder
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取SqlSession
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if (factory != null) {
            // 非自动提交事务
            sqlSession = factory.openSession();
        }
        return sqlSession;
    }
}

