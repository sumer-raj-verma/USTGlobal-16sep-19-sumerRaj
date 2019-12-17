package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernatestudentapp.dto.Student;
import com.ustglobal.jpawithhibernatestudentapp.dto.*;
public class InsertStudentData {
	public static void main(String[] args) {
		
		
		Student studentInfo = new Student();
		studentInfo.setId(102);
		studentInfo.setName("Ashu");
		studentInfo.setRollno(5);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mypersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransation = entityManager.getTransaction();
	    entityTransation.begin();
	    entityManager.persist(studentInfo);
	    System.out.println("Record saved");
	    entityTransation.commit();
	    entityManager.close();
		
		
	}
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


//		Student studentInfo1 = new Student();
//		studentInfo1.setId(105);	
//		studentInfo1.setName("vikash");
//		studentInfo1.setRollno(5);
//
//		EntityManager entityManager =null;
//		EntityTransaction entityTransation = null;
//
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mypersistence");
//			entityManagerFactory.createEntityManager();
//			entityManager.getTransaction();
//			entityTransation.begin();
//			entityManager.persist(studentInfo1);
//			System.out.println("Record saved");
//			entityTransation.commit();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			entityTransation.rollback();
//		}
//		entityManager.close();	
//	}



























































//Student studentInfo2 = new Student();
//studentInfo2.setId(102);	
//studentInfo2.setName("Rakesh Ranjan");
//studentInfo2.setRollno(2);
//
//Student studentInfo3 = new Student();
//studentInfo3.setId(103);	
//studentInfo3.setName("Vikash Saini");
//studentInfo3.setRollno(3);
//
//Student studentInfo4 = new Student();
//studentInfo4.setId(104);	
//studentInfo4.setName("Ashutosh Verma");
//studentInfo4.setRollno(4);
//
//Student studentInfo5 = new Student();
//studentInfo5.setId(105);	
//studentInfo5.setName("Manohar Reddy");
//studentInfo5.setRollno(5);
//
//
//
//Student studentInfo6 = new Student();
//studentInfo6.setId(106);	
//studentInfo6.setName("Akhil Lokande");
//studentInfo6.setRollno(6);
































//entityManager.persist(studentInfo2);
//System.out.println("Record saved");
//entityTransation.commit();
//
//entityManager.persist(studentInfo3);
//System.out.println("Record saved");
//entityTransation.commit();
//
//entityManager.persist(studentInfo4);
//System.out.println("Record saved");
//entityTransation.commit();
//
//entityManager.persist(studentInfo5);
//System.out.println("Record saved");
//entityTransation.commit();
//
//entityManager.persist(studentInfo6);
//System.out.println("Record saved");
//entityTransation.commit();
//entityManager.close();
