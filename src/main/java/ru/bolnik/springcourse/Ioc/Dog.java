package ru.bolnik.springcourse.Ioc;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Created bean Dog");
    }

    @Override
    public void say() {
        System.out.println("Dog says");
    }


//    @PostConstruct
    private void init() {
        System.out.println("Class Dog init");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog destroy");
    }
}
