package com.tyss.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {

//		long number = 99999999l;
		/*System.out.println(addUpto(number));
		System.out.println(addUptoQuick(number));
*/

		countingDuration1();
		countingDuration2();
	}
	public static long addUpto(long number) {
		long total = 0l;
		for (int i = 0; i <= number; i++) {
			total = total+i;
		}
		return total;
	}
	public static long addUptoQuick(long number) {
		return number*(number+1)/2;
	}
   public static void countingDuration1() {
	   long number = 9999999999L;
	   Instant start = Instant.now();
	   System.out.println("addUpto :" + addUpto(number));
	   Instant end = Instant.now();
	  long duration = Duration.between(start, end).toMillis();
	   double second = duration/1000.0;
	   System.out.println("addUpto time :" + second + "seconds");
   }
   public static void countingDuration2() {
	   long number = 9999999999L;
	   Instant start = Instant.now();
	   System.out.println("addUptoQuick :" + addUptoQuick(number));
	   Instant end = Instant.now();
	   long duration = Duration.between(start, end).toMillis();
	   double second = duration/1000.0;
	   System.out.println("addUptoQuick time :" + second + "seconds");
   }
}
