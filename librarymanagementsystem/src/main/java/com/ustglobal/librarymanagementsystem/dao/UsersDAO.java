package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.BooksInventory;

public interface UsersDAO {
	
	public interface StudentDAO {

		public List<BooksInventory> searchBook(BooksInventory booksInventory); 
		public Boolean requestBook(int bookId);
	}


}
