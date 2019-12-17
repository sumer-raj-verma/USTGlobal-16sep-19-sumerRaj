package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class DeleteStudentData {
	public static void main(String[] args) {
		
		EntityTransaction entityTransaction = null;
		 EntityManager entityManager = null;
		
		try {
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
	      entityManager = entityManagerFactory.createEntityManager();
	      entityTransaction =entityManager.getTransaction();
	      entityTransaction.begin();
	      
	      Student studentInfo = entityManager.find(Student.class, 101);
	      entityManager.remove(studentInfo);
	      System.out.println("Record deleted");
	      entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		} 
		entityManager.close();
		
		
		
	}

}
