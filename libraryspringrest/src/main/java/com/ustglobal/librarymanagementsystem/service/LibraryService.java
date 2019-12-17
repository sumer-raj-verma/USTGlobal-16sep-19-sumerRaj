package com.ustglobal.librarymanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.LibraryDAO;
import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrerianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;

@Service
public class LibraryService implements ILibraryService{
	
	@Autowired
	private LibraryDAO dao;
	
	@Override
	public StudentBean loginStudent(String id, String password) {
		// TODO Auto-generated method stub
		return dao.loginStudent(id, password);
	}

	@Override
	public LibrerianBean loginLibrerian(String id, String password) {
		// TODO Auto-generated method stub
		
		return dao.loginLibrerian(id, password);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		if(bean.getPassword().length()>=8) {
			return dao.registerStudent(bean);
		}
		return false;
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		// TODO Auto-generated method stub
		if(bean.getPassword().length()>=8) {
			return dao.registerLibrerian(bean);
		}
		return false;
	}

	@Override
	public BookBean searchBook(int id) {
		// TODO Auto-generated method stub
		return dao.searchBook(id);
	}

	@Override
	public boolean addBook(BookBean bean) {
		// TODO Auto-generated method stub
		return dao.addBook(bean);
	}

	@Override
	public boolean updatebook(BookBean bean) {
		// TODO Auto-generated method stub
		return dao.updatebook(bean);
	}

	@Override
	public boolean deletebook(int id) {
		// TODO Auto-generated method stub
		return dao.deletebook(id);
	}
	@Override
	public List<BookBean> getAllBook() {
		// TODO Auto-generated method stub
		return dao.getAllBook();
	}

	@Override
	public boolean modifyStudent(StudentBean bean) {
		// TODO Auto-generated method stub
		return dao.modifyStudent(bean);
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return dao.deletebook(id);
	}

}
