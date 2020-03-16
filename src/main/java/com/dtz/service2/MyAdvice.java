package com.dtz.service2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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
@Aspect //表名为一个通知类
@Component("myAdvice")
public class MyAdvice {


    public MyAdvice() {
    }

    @Pointcut("execution(* com.dtz.service2.*Impl.*(..))")
    public void p() {

    }
    /**
     * 前置通知
     */
    @Before("MyAdvice.p()")
    public void before() {
        System.out.println("前置通知");
    }
    /**
     * 后置通知（发生异常不会调用）
     */
    @AfterReturning("execution(* com.dtz.service2.*Impl.*(..))")
    public void afterRunner() {
        System.out.println("后置通知（发生异常不会调用）");
    }
    /**
     * 环绕通知
     */
    @Around("execution(* com.dtz.service2.*Impl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知前");
        point.proceed();
        System.out.println("环绕通知后");
    }
    /**
     * 异常拦截通知
     */
    @AfterThrowing("execution(* com.dtz.service2.*Impl.*(..))")
    public void exception() {
        System.out.println("异常通知拦截");
    }
    /**
     * 后置通知
     */
    @After("execution(* com.dtz.service2.*Impl.*(..))")
    public void after() {
        System.out.println("后置通知");
    }
}
