package com.ustglobal.springcore.cofig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BaConfiguration {
	@Bean(name = "author")
	public Author getAuthor() {
		Author author = new Author();
		author.setAname("chetan");
		author.setPenname("china");
		return author;
		
		
	}
	@Bean(name ="book")
	 public Book getBook() {
		Book book = new Book();
		book.setName("wwwww");
		book.setPrice(10.00);
		book.setAuthor(getAuthor());
		return book;
	}

}
