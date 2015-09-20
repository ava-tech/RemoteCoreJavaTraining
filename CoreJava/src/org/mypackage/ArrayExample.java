package org.mypackage;

public class ArrayExample {
	
	
	public static void swap(int[] a, int i, int j){
		
		int temp = a[j];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	public static void swap(int[] a){
		
		int[] sortedArray = new int[a.length];
		int j = 0;
		
		for(int i=0; i<a.length; i++ ){
			
			if(a[i] < a[j]){
				sortedArray[i] = a[i];
			}
			else{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
			
		}
		
		for(int p: sortedArray){
			System.out.print(p);
			
		}
		
	}

	

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
		
//		for(int a: anArray){
//			System.out.print(a);
//		}
//		
//		System.out.println("\n");
//		
//		swap(anArray, 1, 2);
//		
//		for(int a: anArray){
//			System.out.print(a);
//		}
		
		swap(anArray);
		
	}

}
