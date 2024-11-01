package ru.bolnik.springcourse.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test2.entity.Details;
import ru.bolnik.springcourse.hibernate_test2.entity.Employee;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
                Session session = sf.getCurrentSession()){

//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 750);
//            Details details = new Details("New_YorK", "3465784567", "niko@mail.ru");
//
//            employee.setDetails(details);
//            details.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(details);
//
//            session.getTransaction().commit();
//
//            System.out.println("DOne!");

            session.beginTransaction();

            Details details = session.get(Details.class, 1);
            details.getEmployee().setDetails(null);

            session.delete(details);

            session.getTransaction().commit();

            System.out.println("DOne!");

        }

    }
}
