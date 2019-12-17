package com.ustglobal.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertJpql {

		 public static void main(String[] args) {
				
			 EntityTransaction entityTransaction = null;
			 EntityManager entityManager = null;
			
			try {
				EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("test");
		      entityManager = entityManagerFactory.createEntityManager();
		      entityTransaction =entityManager.getTransaction();
		      entityTransaction.begin();
		      
		      String jpql = "insert into product values(:id,:name,:quantity)";
		      Query query = entityManager.createNativeQuery(jpql);
		      query.setParameter("id", 107);
		      query.setParameter("name", "qwer");
		      query.setParameter("quantity", 15);
		      
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
