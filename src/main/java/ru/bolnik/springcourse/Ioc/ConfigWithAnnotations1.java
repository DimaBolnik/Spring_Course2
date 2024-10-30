package ru.bolnik.springcourse.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person);

//        Cat cat = (Cat) context.getBean("cat");
//        cat.say();

        context.close();
    }
}
