package ru.bolnik.springcourse.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session;
            session = sf.getCurrentSession();

            Employee emp = new Employee("Roma", "Ivanov", "IT", 600);
            session.beginTransaction();

            session.save(emp);

            session.getTransaction().commit();
            System.out.println(emp);
        }

    }
}
