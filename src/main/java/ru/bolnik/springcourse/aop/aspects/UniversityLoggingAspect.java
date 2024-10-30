package ru.bolnik.springcourse.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.bolnik.springcourse.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(JoinPoint joinPoint) {
//        System.out.println("beforeGetStudentsLoggingAdvice : логируем получение списка студентов" +
//                           " перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getName();
//        name = "Mr. " + name;
//        firstStudent.setName(name);
//
//        double avg = firstStudent.getAvgGrade();
//        avg = avg + 2;
//        firstStudent.setAvgGrade(avg);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice : логируем получение списка студентов" +
//                           " после работы метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())"
                    , throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice : логируем выброс исключения "
                        + exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : логгируем нормальное" +
                           " окончаний работы метода или выброс исключения");
    }
}
