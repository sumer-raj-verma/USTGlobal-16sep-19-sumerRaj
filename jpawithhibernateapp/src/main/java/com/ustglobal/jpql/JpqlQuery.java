package com.ustglobal.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class JpqlQuery {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//         String jpql = "from Product";	
		String jpql ="select pname from Product";
		Query query= entityManager.createQuery(jpql);
		query.getResultList();

		//	List<Product> list = query.getResultList();
		List <String> list = query.getResultList();
		for (String product : list) {
			//		System.out.println("Pid===> "+product.getPid());
			//		System.out.println("Pname===> "+product.getPname());
			System.out.println("pname==>"+ product);
			//		System.out.println("Pquantity===> "+product.getQuantity());
			System.out.println("=====================================");


		}

	}

}
