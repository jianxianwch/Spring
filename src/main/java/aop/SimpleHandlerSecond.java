package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wangchaohui
 * @version 1.0
 * @date 2018/11/26 22:30
 */
@Aspect
public class SimpleHandlerSecond {

    @Before(value = "execution(* aop.DemoModelOne.methodTwo(..))")
    public void before(){
        System.out.println("SimpleHandler::before");
    }

    @After(value = "execution(* aop.DemoModelOne.methodTwo(..))")
    public void after(){
        System.out.println("SimpleHandler::after");
    }
    @Around(value = "execution(* aop.DemoModelOne.methodTwo(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        before();
        proceedingJoinPoint.proceed();
        after();
    }
}
