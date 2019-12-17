package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernatestudentapp.dto.Student;



public class UpdateStudentData {
	public static void main(String[] args) {
		

		 EntityTransaction entityTransaction = null;
		 EntityManager entityManager = null;
		
		try {
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("Mypersistence");
	      entityManager = entityManagerFactory.createEntityManager();
	      entityTransaction =entityManager.getTransaction();
	      entityTransaction.begin();
	      
	      Student studentInfo = entityManager.find(Student.class, 101);
	      studentInfo.setId(102);
	      System.out.println("record update");
	      entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		} 
		entityManager.close();
		
		
	}

}
