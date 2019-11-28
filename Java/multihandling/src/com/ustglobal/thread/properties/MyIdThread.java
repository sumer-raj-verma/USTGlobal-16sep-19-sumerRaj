package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("MyId Thread :"+ mi.getId());

//		mi.setId();
		System.out.println("Priority: "+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(6);	//	IllegalArgumentException
		int x = Thread.currentThread().getPriority();	//	IllegalArgumentException
		System.out.println(x);
		
		System.out.println("Main Ended");
	}
}
