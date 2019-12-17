package com.ustglobal.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDynamic {
	 public static void main(String[] args) {
			
		 EntityTransaction entityTransaction = null;
		 EntityManager entityManager = null;
		
		try {
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
	      entityManager = entityManagerFactory.createEntityManager();
	      entityTransaction =entityManager.getTransaction();
	      entityTransaction.begin();
	      String jpql = "update Product set pname=:name where pid=:id";
	     Query query = entityManager.createQuery(jpql);
	     query.setParameter("name", "book");
	     query.setParameter("id", 101);
	     int result = query.executeUpdate();
	     System.out.println("result");
	     
	      entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		} 
		entityManager.close();
	}


}
