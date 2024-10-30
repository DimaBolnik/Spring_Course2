package ru.bolnik.springcourse.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.bolnik.springcourse.aop.Book;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* ru.bolnik.springcourse.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void ru.bolnik.springcourse.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice : Log#10");
//    }


//    @Pointcut("execution(* ru.bolnik.springcourse.aop.UniLibrary.get*())")
//    private void allGetMethodsUniLibrary(){}
//
//    @Pointcut("execution(* ru.bolnik.springcourse.aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibrary(){}
//
//    @Pointcut("allGetMethodsUniLibrary() || allReturnMethodsUniLibrary()")
//    private void allGetAndReturnMethodsUniLibrary(){}
//
//    @Before("allGetMethodsUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvise : writing Log #1");
//    }
//
//    @Before("allReturnMethodsUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvise : writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvise : writing Log #3");
//    }



    @Before("ru.bolnik.springcourse.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object arg : args){
                if (arg instanceof Book){
                    Book book = (Book) arg;
                    System.out.println("Информация о книги: название -" + book.getName() +
                                       ", автор - " + book.getAuthor() +
                                       ", год издания - " + book.getYearOfPublication());
                } else if (arg instanceof String){
                    System.out.println("книгу в библеотеку добавляет " + arg);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логгирование попытки получить книгу/журнал");
        System.out.println("---------------------------------------------");
    }


}
