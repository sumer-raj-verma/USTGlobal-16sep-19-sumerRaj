package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManytoMany {
	public static void main(String[] args) {

		Course course = new Course();
		course.setCid(10);
		course.setCname("java");

		Course course1 = new Course();
		course1.setCid(20);
		course1.setCname("sql");
		
		Course course2 = new Course();
		course2.setCid(30);
		course2.setCname("python");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(course);
		al.add(course1);
		al.add(course2);
		
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("sumer");
		student.setCourses(al);

		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(student);
			entityTransaction.commit();
			System.out.println("Record saved");

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}


}
