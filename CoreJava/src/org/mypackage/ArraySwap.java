package org.mypackage;

import java.util.Scanner;

public class ArraySwap {

	static String answer;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter the array size: ");
		answer = s.next();

		int a = Integer.parseInt(answer);
		int[] anArray = new int[a];

		for (int i = 0; i < anArray.length; i++) {
			anArray[i] = (int) (Math.random() * 101);
		}
		swapNumber(anArray);
	}

	public static void swapNumber(int[] unSortedArray) {
		System.out.print("Unsorted Array: ");
		for (int a : unSortedArray) {
			System.out.print(a + ", ");
		}

		for (int i = 0; i < unSortedArray.length; i++) {
			for (int j = 0; j < unSortedArray.length; j++) {
				if (unSortedArray[i] < unSortedArray[j]) {
					int tmp = unSortedArray[i];
					unSortedArray[i] = unSortedArray[j];
					unSortedArray[j] = tmp;
				}
			}
		}

		System.out.println("\n");
		System.out.print("Sorted Array: ");

		for (int a : unSortedArray) {
			System.out.print(a + ", ");
		}

	}

}
