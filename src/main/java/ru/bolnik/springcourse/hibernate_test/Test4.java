package ru.bolnik.springcourse.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test.entity.Employee;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session= sf.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 2);
//            emp.setSalary(2000);

            session.createQuery("update Employee set salary=1300" +
                                " where firstName='Dima'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
