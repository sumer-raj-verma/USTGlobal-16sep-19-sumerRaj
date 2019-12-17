package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {
	
		 EntityTransaction entityTransaction = null;
		 EntityManager entityManager = null;
		
		try {
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
	      entityManager = entityManagerFactory.createEntityManager();
	      entityTransaction =entityManager.getTransaction();
	      entityTransaction.begin();
	      
	      Product productInfo = entityManager.find(Product.class, 102);
	      System.out.println(entityManager.contains(productInfo));
	      entityManager.detach(productInfo);
	      System.out.println(entityManager.contains(productInfo));
	      Product productInfo1 = entityManager.merge(productInfo);
	      productInfo1.setPname("mobile");
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
