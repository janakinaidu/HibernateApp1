package com.naidu.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveDataDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.openSession();
		try {
			Student student1 = new Student("krishna", "punnana", "ECE");
			Student student2 = new Student("bhushan", "kadime", "ECE");
			Student student3 = new Student("venki", "duddu", "ECE");
			session.beginTransaction();
			//session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
			System.out.println("student data object successfully inserted into the database");
			System.out.println("HIbernateApp1");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}
