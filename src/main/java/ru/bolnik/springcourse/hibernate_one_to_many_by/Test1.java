package ru.bolnik.springcourse.hibernate_one_to_many_by;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_one_to_many_by.entity.Department;
import ru.bolnik.springcourse.hibernate_one_to_many_by.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
                Session session = sf.getCurrentSession()){
//            Department department = new Department("Sales", 800, 1200);
//            Employee employee1 = new Employee("Dima", "Bolnik", 800);
//            Employee employee2 = new Employee("Roma", "Smirn0v", 1000);
//            Employee employee3 = new Employee("Elena", "Valenok", 1300);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("DOne!");



            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("DOne!");


//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DOne!");

//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);
//            session.getTransaction().commit();
//            System.out.println("DOne!");
        }

    }
}
