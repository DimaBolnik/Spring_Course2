package ru.bolnik.springcourse.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test.entity.Employee;

public class Test5 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session= sf.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);
            session.createQuery("delete from Employee where firstName like 'Oleg'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
