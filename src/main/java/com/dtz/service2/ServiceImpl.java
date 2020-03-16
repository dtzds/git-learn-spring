package com.dtz.service2;

import org.springframework.stereotype.Component;

/**
 * 目标对象
 */
@Component("serviceImpl")
public class ServiceImpl implements Service {
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void del() {
        System.out.println("del");
    }

    @Override
    public void add() {
        System.out.println("add");
    }
}
