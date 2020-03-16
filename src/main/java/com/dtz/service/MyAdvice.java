package com.dtz.service;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *      通知
 * 	  		前置通知：
 * 	  			目标方法运行之前调用
 * 	  		后置通知（如果出现异常不会调用）：
 * 	  			在目标方法运行之后调用
 * 	  		环绕通知：
 * 	  			在目标方法运行之前和之后都会调用
 * 	  		异常拦截通知：
 * 	  			如果出现异常就会调用
 * 	  		后置通知（如果出现异常也会调用）：
 * 	  			在目标方法运行之后调用
 */
public class MyAdvice {
    /**
     * 前置通知
     */
    public void before() {
        System.out.println("前置通知");
    }
    /**
     * 后置通知（发生异常不会调用）
     */
    public void afterRunner() {
        System.out.println("后置通知（发生异常不会调用）");
    }
    /**
     * 环绕通知
     */
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知前");
        point.proceed();
        System.out.println("环绕通知后");
    }
    /**
     * 异常拦截通知
     */
    public void exception() {
        System.out.println("异常通知拦截");
    }
    /**
     * 后置通知
     */
    public void after() {
        System.out.println("后置通知");
    }
}
