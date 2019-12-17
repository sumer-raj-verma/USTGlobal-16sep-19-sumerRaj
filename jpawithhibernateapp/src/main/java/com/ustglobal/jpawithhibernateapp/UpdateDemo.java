package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDemo {
 public static void main(String[] args) {
	
	 EntityTransaction entityTransaction = null;
	 EntityManager entityManager = null;
	
	try {
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
      entityManager = entityManagerFactory.createEntityManager();
      entityTransaction =entityManager.getTransaction();
      entityTransaction.begin();
      
      Product productInfo = entityManager.find(Product.class, 102);
      productInfo.setPname("Pencil");
      System.out.println("record update");
      entityTransaction.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		entityTransaction.rollback();
	} 
	entityManager.close();
}

}
