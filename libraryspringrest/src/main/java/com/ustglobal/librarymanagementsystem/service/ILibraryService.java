package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.LibrerianBean;
import com.ustglobal.librarymanagementsystem.dto.StudentBean;

public interface ILibraryService {
	public StudentBean loginStudent(String id,String password);
	public boolean registerStudent(StudentBean bean);
	public boolean modifyStudent(StudentBean bean);
	public boolean deleteStudent(int id);
	
	
	public LibrerianBean loginLibrerian(String id,String password);
	public boolean registerLibrerian(LibrerianBean bean);
	
	
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(BookBean bean);
	public boolean deletebook(int id);
	public List<BookBean> getAllBook();

	
}
