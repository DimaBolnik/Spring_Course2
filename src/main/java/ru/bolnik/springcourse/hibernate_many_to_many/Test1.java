package ru.bolnik.springcourse.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.bolnik.springcourse.hibernate_many_to_many.entity.Child;
import ru.bolnik.springcourse.hibernate_many_to_many.entity.Section;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();
                Session session = sf.getCurrentSession()) {

//            Section section1 = new Section("Dance");
//
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 9);
//            Child child3 = new Child("Pavel", 7);
//
//            section1.addChild(child1);
//            section1.addChild(child2);
//            section1.addChild(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //*********************************************
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child1 = new Child("Anfisa", 6);
//
//            child1.addSection(section1);
//            child1.addSection(section2);
//            child1.addSection(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //*********************************************
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //*********************************************
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");



            session.beginTransaction();

            Child child = session.get(Child.class, 5);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
