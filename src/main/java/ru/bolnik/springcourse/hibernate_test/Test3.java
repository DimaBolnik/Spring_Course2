package ru.bolnik.springcourse.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test.entity.Employee;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session= sf.getCurrentSession();
            session.beginTransaction();

            List<Employee> employeeList = session.createQuery(
                    "from Employee where firstName like 'Roma' and salary > 700").getResultList();
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
            session.getTransaction().commit();
            System.out.println("Done!");
        }

    }
}
