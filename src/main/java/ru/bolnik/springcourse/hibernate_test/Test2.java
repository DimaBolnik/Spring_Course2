package ru.bolnik.springcourse.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test.entity.Employee;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session;
            session = sf.getCurrentSession();

            Employee emp = new Employee("Oleg", "Sidorov", "HR", 400);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int empId = emp.getId();
//            session = sf.getCurrentSession();
//            session.beginTransaction();
            Employee emp2 = session.get(Employee.class, empId);
            session.getTransaction().commit();
            System.out.println(emp2);

            System.out.println("Done!");
        }

    }
}
