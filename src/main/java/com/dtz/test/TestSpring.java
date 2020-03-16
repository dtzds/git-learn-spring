package com.dtz.test;

import com.dtz.bean.User;
import com.dtz.bean.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = ac.getBean("user1", User.class);
        System.out.println(user1);
    }

    @Test
    public void test03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        User1 user1 = ac.getBean("user", User1.class);
        System.out.println(user1);
    }
}
