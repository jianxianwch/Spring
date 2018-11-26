package aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author wangchaohui
 * @version 1.0
 * @date 2018/11/26 22:10
 */
public class SimpleHandler {

    public void before(){
        System.out.println("SimpleHandler::before");
    }

    public void after(){
        System.out.println("SimpleHandler::after");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        before();
        proceedingJoinPoint.proceed();
        after();
    }
}
