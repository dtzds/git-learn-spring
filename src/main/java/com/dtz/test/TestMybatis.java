package com.dtz.test;

import com.dtz.bean.Admin;
import com.dtz.mapper.adminMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void test01() throws IOException {
        String path = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(path);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(in);
        SqlSession sqlSession = build.openSession();
        Admin admin = new Admin(3,"cdd","123456");
        int i = sqlSession.insert("addAdmin", admin);
        System.out.println(i);
        List<Admin> list = sqlSession.selectList("selectAdmin");
        for (Admin a : list) {
            System.out.println(a);
        }

    }
}

class outter {
    private int x = 10;
    private static String y = "aa";
    class inner1 {

    }
    public void method() {
        final int y = 7;
        class inner2 {
            int x = 5;
            void method() {
                System.out.println(x);
                System.out.println(outter.this.x);
                System.out.println(y);
            }
        }
    }

    static class inner {
        void method() {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {

        outter.inner oi1 = new outter.inner();
        outter.inner1 oi2 = new outter().new inner1();
    }
}