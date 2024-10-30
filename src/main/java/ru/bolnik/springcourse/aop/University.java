package ru.bolnik.springcourse.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<Student>();

    public void addStudent() {
        Student st1 = new Student("Dima", 4 , 7.5);
        Student st2 = new Student("Mixail", 3 , 8.3);
        Student st3 = new Student("Elena", 1 , 5.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("начало работы метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
