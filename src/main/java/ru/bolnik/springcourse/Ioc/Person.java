package ru.bolnik.springcourse.Ioc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private String surname;
    private int age;
    @Autowired
    private Pet pet;

    public Person() {
        System.out.println("Person constructor not args");
    }

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person surname set");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person age set");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Person pet is set");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
               "surname='" + surname + '\'' +
               ", age=" + age +
               ", pet=" + pet +
               '}';
    }
}
