package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestEmployee {
	public static void main(String[] args) {
		
		
		

		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setId(104);
		employeeInfo.setName("reddy");
		employeeInfo.setEmail("reddy@gmail.com");
		
		
		
		EmployeeOtherInfo employeeOtherInfo = new EmployeeOtherInfo();
		employeeOtherInfo.setEid(102);
		employeeOtherInfo.setFname("Raj");
		employeeOtherInfo.setPancard("102india");
		employeeOtherInfo.setEmp(employeeInfo);

		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransation = entityManager.getTransaction();
	    entityTransation.begin();
	    entityManager.persist(employeeInfo);
	    
	    System.out.println("Record saved");
//	    entityTransation.commit();
	    entityManager.persist(employeeOtherInfo);
	    System.out.println("=============================");
	    entityTransation.commit();
	    entityManager.close();
		
	}
	
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	