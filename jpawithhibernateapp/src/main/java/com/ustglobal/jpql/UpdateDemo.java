package com.ustglobal.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManagerFactory.createEntityManager();
			entityManager.getTransaction();
			transaction.begin();
			String jpql = "update Product set pname = 'class' where pid =102";
			Query query = entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally {
			entityManager.close();
		}
		
		
		
	}

}
