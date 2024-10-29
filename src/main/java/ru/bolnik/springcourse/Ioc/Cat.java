package ru.bolnik.springcourse.Ioc;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("created bean Cat");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
