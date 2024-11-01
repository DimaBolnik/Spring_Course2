package ru.bolnik.springcourse.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_test2.entity.Details;
import ru.bolnik.springcourse.hibernate_test2.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
                Session session = sf.getCurrentSession()){
//            Session session = sf.getCurrentSession();
//            Employee employee = new Employee("Dima", "Bolnik", "IT", 500);
//            Details details = new Details("Penza", "12344235", "dima@mail.ru");
//            employee.setDetails(details);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("DOne!");


            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DOne!");
        }

    }
}
