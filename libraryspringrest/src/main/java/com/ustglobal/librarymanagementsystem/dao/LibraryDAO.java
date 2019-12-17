package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrerianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;
import com.ustglobal.librarymanagementsystem.dto.BookBean;

public interface LibraryDAO {
	
//	Student Related Operations
	
	public boolean registerStudent(StudentBean bean);
	public StudentBean loginStudent(String id,String password);
	public boolean modifyStudent(StudentBean bean);
	public boolean deleteStudent(int id);
	
	
	
//	admin related operation
	public LibrerianBean loginLibrerian(String id,String password);
	public boolean registerLibrerian(LibrerianBean bean);
	
	
	
//	Books Related operations
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(BookBean bean);
	public boolean deletebook(int id);
	public List<BookBean> getAllBook();

}
