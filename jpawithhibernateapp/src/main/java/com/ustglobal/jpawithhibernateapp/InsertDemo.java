package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
	
	public static void main(String[] args) {
	
		Product productInfo = new Product();
		productInfo.setPid(102);
		productInfo.setPname("marker");
		productInfo.setQuantity(15);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransation = entityManager.getTransaction();
	    entityTransation.begin();
	    entityManager.persist(productInfo);
	    System.out.println("Record saved");
	    entityTransation.commit();
	    entityManager.close();
		
		
	}
	

}
