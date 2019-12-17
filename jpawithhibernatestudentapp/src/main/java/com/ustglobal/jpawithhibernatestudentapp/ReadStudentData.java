package com.ustglobal.jpawithhibernatestudentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernatestudentapp.dto.Student;

public class ReadStudentData {
	public static void main(String[] args) {
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mypersistence");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student studentinfo =  entityManager.find(Student.class, 101);
		System.out.println("Student Id    ==> "+ studentinfo.getId());    
		System.out.println("Student Name  ==> " +studentinfo.getName());    
		System.out.println("Student RollNo==> "+ studentinfo.getRollno());    
		
	}

}
