package ru.bolnik.springcourse.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml");

        Dog dog = (Dog) context.getBean("dog");
        dog.say();


        context.close();
    }
}
