package ru.bolnik.springcourse.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_one_to_many_uni.entity.Department;
import ru.bolnik.springcourse.hibernate_one_to_many_uni.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
                Session session = sf.getCurrentSession()){
//
//            Department department = new Department("HR", 200, 700);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 400);
//            Employee employee2 = new Employee("Sveta", "Sn0v", 300);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("DOne!");



//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("DOne!");

//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//
//            session.getTransaction().commit();
//            System.out.println("DOne!");
//
            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);
            session.getTransaction().commit();
            System.out.println("DOne!");
        }

    }
}
