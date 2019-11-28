package com.ustglobal.exception.first;

public class BMS {
	public static void main(String[] args) {
		System.out.println("BMS Started");
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("Booking Confirmed");
			
		} catch (ArithmeticException e) {
			System.out.println("Booking Failed");
		}
		
		System.out.println("BMS Ended");
	}
}
