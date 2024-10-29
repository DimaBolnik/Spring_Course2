package ru.bolnik.springcourse.Ioc;


public class Dog implements Pet {
    public Dog() {
        System.out.println("Created bean Dog");
    }

    @Override
    public void say() {
        System.out.println("Dog says");
    }


    private void init() {
        System.out.println("Class Dog init");
    }

    public void destroy() {
        System.out.println("Class Dog destroy");
    }
}
