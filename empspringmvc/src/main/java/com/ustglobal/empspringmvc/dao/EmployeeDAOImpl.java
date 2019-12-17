package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	

	public EmployeeBean login(int id, String password) {
		String jpql = "from EmployeeBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			EmployeeBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		// TODO Auto-generated method stub
		
	}

	public int register(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}

	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class,id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}

	public EmployeeBean searchEmployee(int id) {
		
		EntityManager manager = factory.createEntityManager();
		
		return manager.find(EmployeeBean.class, id);
		
	}

	public boolean updateEmployee(EmployeeBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeeBean = manager.find(EmployeeBean.class,bean.getId());
		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
//		employeeBean.setId(bean.getId());
//		employeeBean.setEmail(bean.getEmail());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
	
		// TODO Auto-generated method stub
		return true;
	}

	public boolean changePassword(int id ,String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
        transaction.commit();
          return true;
	
	}

	

}
