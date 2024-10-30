package ru.bolnik.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean(UniLibrary.class);
        Book book = context.getBean("book",Book.class);
        library.getBook();
        library.addBook("Dima", book);
        library.addMagazine();
//        library.getMagazine();
//        library.returnBook();
//        library.getMagazine();
//
//        SchoolLibrary library2 = context.getBean(SchoolLibrary.class);
//        library2.getBook();

        context.close();
    }
}
