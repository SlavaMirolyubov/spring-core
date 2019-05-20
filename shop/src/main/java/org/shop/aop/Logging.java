package org.shop.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
public class Logging {

    private static Logger logger = Logger.getLogger(Logging.class);

//    @Pointcut("execution(* org.shop.api.impl.ItemServiceImpl*(..))")
//    public void webServiceMethod() { }

    @Pointcut("@annotation(org.shop.aop.Loggable)")
    public void loggableMethod() { }

//    @Pointcut("execution(* org.shop.api..*(..))")
//    public void aloha() { }
//
    @Before("loggableMethod()")
    public void methofd(JoinPoint joinPoint) {
        Signature methodName = joinPoint.getSignature();
        logger.info(methodName.getName() + " " + methodName.getDeclaringTypeName());
    }

//    @Around("loggableMethod()")
//    public Object logWebServiceCall(ProceedingJoinPoint thisJoinPoint) {
//        String methodName = thisJoinPoint.getSignature().getName();
//        Object[] methodArgs = thisJoinPoint.getArgs();
//
//        Object result = null;
//        try {
//            result = thisJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//
//        System.out.println("Вызван метод: " + methodName);
//
//        return result;
//    }
}
