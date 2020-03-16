package com.dtz.test;

import com.dtz.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextJDBC.xml");
        UserDaoImpl userDao = ac.getBean("userDao", UserDaoImpl.class);
        int i = userDao.addUser();
        System.out.println(i);
    }
}
