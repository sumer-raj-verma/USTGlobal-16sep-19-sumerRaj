package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;
import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		
		VoterCard voterCard = new VoterCard();
		voterCard.setVid(11);
		voterCard.setVname("Ram");
		
		Person person =new Person();
		person.setPid(2);
		person.setName("Ram");
		person.setVoterCard(voterCard);
		
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
		
	entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
	    entityTransaction.begin();
	    VoterCard voterCard2 = entityManager.find(VoterCard.class,11);
	    System.out.println(voterCard2.getPerson().getPid());
      //entityManager.persist(person);
	    System.out.println("Record saved");
	    entityTransaction.commit();
	   
		}
          catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
//	    	entityTransaction.rollback();
//	    
		}
	    entityManager.close();	
	}
		
}   


