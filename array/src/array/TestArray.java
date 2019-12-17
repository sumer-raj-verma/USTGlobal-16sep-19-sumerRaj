package array;

import java.util.Scanner;

public class TestArray {
	
	public static void main(String[] args) {
		System.out.println("Enter the no. of elements");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.println("Elements are :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Elements after bubble sort: ");
		
			
		  BubbleSort.bubbleUpSort(arr1);
		  System.out.println();
		  System.out.println("==================================");
		 
		  
		  System.out.println("Elements after insertion sort: ");
		
		  InsertionSort.insertionSort(arr1);
		  System.out.println();
		  System.out.println("==================================");
		  
		  
		 /* System.out.println("Elements after merge sort: ");
		
		  MergeSort.mergesort(arr1,0,arr1.length-1);
		  System.out.println();
		  System.out.println("==================================");
		  
		  System.out.println("Elements after quick sort: ");
			
		  QuickSort.quickSort(arr1,0,arr1.length-1);
		  System.out.println();
		  System.out.println("==================================");
		  
		  System.out.println("Elements after selection sort: ");
			
		  SelectionSort.selectionSort(arr1);
		  System.out.println();
		  System.out.println("==================================");
		
		*/
		
		
	}

	
	
}
