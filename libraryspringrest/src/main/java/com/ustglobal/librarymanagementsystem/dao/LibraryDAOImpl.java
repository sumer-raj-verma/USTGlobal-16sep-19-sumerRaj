package com.ustglobal.librarymanagementsystem.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrerianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;

@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	
//	student Method

	@Override
	public boolean registerStudent(StudentBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;			
		}
	}

	
	@Override
	public StudentBean loginStudent(String id, String password) {
		String jpql = "from StudentBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<StudentBean> query = manager.createQuery(jpql, StudentBean.class);
		try {
			StudentBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	@Override
	public boolean modifyStudent(StudentBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		StudentBean studentBean = manager.find(StudentBean.class, bean.getId());
		studentBean.setName(bean.getName());
        studentBean.setPassword(bean.getPassword());
		transaction.commit();
		return true;
		
		
		
	}

	@Override
	public boolean deleteStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
	   StudentBean bean = manager.find(StudentBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
	//Admin Related operation
	
	
	
	@Override
	public LibrerianBean loginLibrerian(String id, String password) {
		String jpql = "from LiberianBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<LibrerianBean> query = manager.createQuery(jpql, LibrerianBean.class);
		try {
			LibrerianBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;			
		}
	}

	@Override
	public BookBean searchBook(int id) {
		
		EntityManager manager  = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			transaction.commit();
			return bean;
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addBook(BookBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;			
		}
	}

	@Override
	public boolean updatebook(BookBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean book = manager.find(BookBean.class, bean.getBid());
			book.setBname(bean.getBname());
			book.setBauthor(bean.getBauthor());
			book.setPublication(bean.getPublication());
			transaction.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deletebook(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookBean> getAllBook() {
		String jpql = "from BookBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql,BookBean.class);
		List<BookBean> bookBeans= query.getResultList();
		return bookBeans;
	}

	

	
}
