package com.lfsenior.learn.springbeanaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springbeanaop
 * @ClassName: LogAspectj
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/25 9:29
 * @Version: 1.0
 */
@Component
@Aspect
public class LogAspectj {

    @Pointcut("execution(* com.lfsenior.learn.springbeanaop.*Service.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("=======before=========");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("=======after=========");
    }

    @Around("pointcut()")
    public Object logProfile(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println("[ProfilingAspect]方法: 【" + joinPoint.getSignature() + "】结束，用时: " + (System.currentTimeMillis() - start));

        return result;
    }
}
