package ru.bolnik.springcourse.Ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person);

        context.close();
    }
}
