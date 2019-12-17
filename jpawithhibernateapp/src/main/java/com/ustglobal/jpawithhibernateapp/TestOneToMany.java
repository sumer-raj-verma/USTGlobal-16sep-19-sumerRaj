package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {

		PencilBox pencilBox = new PencilBox();
		pencilBox.setBid(1);
		pencilBox.setBname("Apsara");

		Pencil pencil = new Pencil();
		pencil.setPid(10);
		pencil.setColor("black");
		pencil.setPencilBox(pencilBox);

		Pencil pencil2 = new Pencil();
		pencil2.setPid(11);
		pencil2.setColor("white");

		pencil2.setPencilBox(pencilBox);


		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

//			entityManager.persist(pencil);
//			entityManager.persist(pencil2);   unidirectional
			
			
			PencilBox pBox = entityManager.find(PencilBox.class,1);
			System.out.println(pBox.getPencil().get(1));
			entityTransaction.commit();
			System.out.println("Record saved");

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}

}
