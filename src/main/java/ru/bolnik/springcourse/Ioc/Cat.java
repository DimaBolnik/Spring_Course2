package ru.bolnik.springcourse.Ioc;

public class Cat implements Pet{

    public Cat() {
        System.out.println("created bean Cat");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
