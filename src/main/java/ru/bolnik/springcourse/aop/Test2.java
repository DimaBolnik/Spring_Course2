package ru.bolnik.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MyConfig.class);

        University university = context.getBean(University.class);
        university.addStudent();
        List<Student> students = null;
        try {
            students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Было поймано иключение " + e);;
        }

        context.close();
    }
}
