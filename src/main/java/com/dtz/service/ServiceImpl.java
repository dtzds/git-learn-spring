package com.dtz.service;

/**
 * 目标对象
 */
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
        throw new NullPointerException("出错了");
    }
}
