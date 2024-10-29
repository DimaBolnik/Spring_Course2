package ru.bolnik.springcourse.Ioc;

public class Person {
    private String surname;
    private int age;
    private Pet pet;

    public Person() {
        System.out.println("Person constructor not args");
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

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
