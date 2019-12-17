package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.cofig.BaConfiguration;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class BookApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaConfiguration.class);
		Book book = context.getBean(Book.class);
		System.out.println("Book name :"+ book.getName());
		System.out.println("book price :"+book.getPrice());
		System.out.println("author name :"+book.getAuthor().getAname());
		System.out.println("pen name :"+ book.getAuthor().getPenname());
	     
	
	}

}
