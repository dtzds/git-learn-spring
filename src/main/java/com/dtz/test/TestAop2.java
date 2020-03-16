package com.dtz.test;

import com.dtz.service2.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContextAop2.xml"})
public class TestAop2 {
    @Resource(name = "serviceImpl")
    private Service service;

    @Test
    public void test01() {
        service.add();
    }
}
