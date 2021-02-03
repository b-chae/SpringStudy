package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			session.beginTransaction();
			
			System.out.println("\nGetting student with id: " + studentId);
			
			// retrieve student based on the primary key
			Student myStudent = session.get(Student.class, studentId);
			
			myStudent.setFirstName("Scooby");
			
			System.out.println("Get complete : " + myStudent);
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Update eamil for all students");
			
			session.createQuery("Update Student set email='foo@gmail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

}
