package ru.bolnik.springcourse.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("----------------------------------");
    }

    public void getMagazine() {
        System.out.println("Mы берем журнал из UniLibrary");
        System.out.println("----------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возврашаем книгу в UniLibrary");
        System.out.println("----------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возврашаем жулнал в UniLibrary");
        System.out.println("----------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("----------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("----------------------------------");
    }


}
