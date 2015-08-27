package org.mypackage;

public class ArrayExample {

	public static void main(String[] args) {
		
		//declare an array of integer
		int[] anArray;
		
		//allocates memory for 5 integers
		anArray = new int[5];
		
		//initialize elements 
		anArray[0] = 2;
		anArray[1] = 1;
		anArray[2] = 5;
		anArray[3] = 7;
		anArray[4] = 10;
		
		//printing elements from array
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 4: " + anArray[4]);

	}

}
