package org.shop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class Logging {

//    @Pointcut("execution(* org.shop.api.impl.ItemServiceImpl*(..))")
//    public void webServiceMethod() { }

    @Pointcut("@annotation(org.shop.aop.Loggable)")
    public void loggableMethod() { }

    @Pointcut("execution(* org.shop.api..*(..))")
    public void aloha() { }
//
//    @Before("aloha()")
//    public void methofd() {
//        System.out.println("Aspect1");
//    }

    @Around("loggableMethod() && aloha()")
    public Object logWebServiceCall(ProceedingJoinPoint thisJoinPoint) {
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();

        Object result = null;
        try {
            result = thisJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("Вызван метод: " + methodName);

        return result;
    }
}
