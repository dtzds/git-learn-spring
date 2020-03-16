package com.dtz.test;


import com.dtz.bean.User1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext1.xml"})
public class TestZJ {
    @Resource(name = "user")
    private User1 u;

    @Test
    public void test1() {
        System.out.println(u);
    }
}
