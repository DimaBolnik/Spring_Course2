package ru.bolnik.springcourse.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу и Школьной библиотеки");
    }
}
