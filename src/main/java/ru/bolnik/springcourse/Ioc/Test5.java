package ru.bolnik.springcourse.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");

        Dog dog = (Dog) context.getBean("myPet");
        dog.say();

        Dog dog2 = (Dog) context.getBean("myPet");
        dog2.say();

        context.close();
    }
}
