package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetRefrenceMethod {
	
public static void main(String[] args) {
	
	
	EntityManager entityManager =null;
	EntityTransaction transaction =null;
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		
		 entityManager = entityManagerFactory.createEntityManager();
		Product productDetail =  entityManager.getReference(Product.class, 103);
//		Product product = entityManager.find(Product.class, 103);
//		System.out.println(product.getClass());
//		
		System.out.println("Id ===> "+ productDetail.getPid());    
		System.out.println("Pname ===> " +productDetail.getPname());    

		
		System.out.println("pqty===> "+ productDetail.getQuantity());  
		entityManager.close();
		
	}
	
	


}
