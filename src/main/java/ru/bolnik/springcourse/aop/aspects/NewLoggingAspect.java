package ru.bolnik.springcourse.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice : в библиотеку пытаются вернуть книгу");


        Object targetMethod = null;
        try {
            targetMethod = pjp.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice : было залогирование исключения " + e);
            throw e;
        }


        System.out.println("aroundReturnBookLoggingAdvice : в библиотеку успешно вернули книгу");


        return targetMethod;
    }
}
