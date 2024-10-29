package ru.bolnik.springcourse.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");

        Dog myDog = (Dog) context.getBean("myPet");
//        myDog.setName("Belka");
        System.out.println("--------------");
        Dog yourDog = (Dog) context.getBean("myPet");
//        yourDog.setName("Strelka");

//        System.out.println(myDog.getName());
        context.close();
    }
}
