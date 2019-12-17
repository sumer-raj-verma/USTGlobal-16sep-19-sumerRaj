package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMAnyToOne {

	public static void main(String[] args) {
     EmployeeInfo employeeInfo = new EmployeeInfo();
     employeeInfo.setId(110);
     employeeInfo.setName("rajesh");
     employeeInfo.setEmail("rajesh@gmail.com");
     
     Experiance experiance = new Experiance();
     experiance.setExpid(1);
     experiance.setCompanyname("vogo");
     experiance.setYears(3);
     experiance.setEmp(employeeInfo);
     
     
     Experiance experiance2 = new Experiance();
     experiance2.setExpid(2);
     experiance2.setCompanyname("software AG");
     experiance2.setYears(1);
     experiance2.setEmp(employeeInfo);


		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("library-unit");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

//			entityManager.persist(pencil);
//			entityManager.persist(pencil2);   unidirectional
			
			entityManager.persist(experiance);
			entityManager.persist(experiance2);
			
//			PencilBox pBox = entityManager.find(PencilBox.class,1);
//			System.out.println(pBox.getPencil().get(1));
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

	
	
	

