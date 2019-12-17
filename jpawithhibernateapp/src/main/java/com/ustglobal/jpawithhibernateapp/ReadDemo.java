package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail =  entityManager.find(Product.class, 102);
		System.out.println("Id ===> "+ productDetail.getPid());    
		System.out.println("Pname ===> " +productDetail.getPname());    
		System.out.println("pqty===> "+ productDetail.getQuantity());    
		
	}
	
	

}
