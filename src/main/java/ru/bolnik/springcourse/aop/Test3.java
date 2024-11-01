package ru.bolnik.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MyConfig.class);

        UniLibrary uniLibrary = context.getBean(UniLibrary.class);

        String returnBook = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу : " + returnBook);

        context.close();
        System.out.println("Method main ends");
    }
}
