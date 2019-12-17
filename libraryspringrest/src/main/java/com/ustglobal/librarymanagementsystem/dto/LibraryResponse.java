package com.ustglobal.librarymanagementsystem.dto;



import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private BookBean book;
	private List<BookBean> bookbean;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BookBean getBook() {
		return book;
	}
	public void setBook(BookBean book) {
		this.book = book;
	}
	public List<BookBean> getBookbean() {
		return bookbean;
	}
	public void setBookbean(List<BookBean> bookbean) {
		this.bookbean = bookbean;
	}
	
	
	
	
	
}
