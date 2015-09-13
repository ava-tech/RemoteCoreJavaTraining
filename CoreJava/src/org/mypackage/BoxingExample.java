package org.mypackage;

import java.util.ArrayList;
import java.util.List;

public class BoxingExample {

	public static void main(String[] args) {
		
		
		List<Double> doubleObj = new ArrayList<>();
		List<Integer> integerObj = new ArrayList<>();
		
		double a = 3.14;
		double b = 4.19;
		double c = 9.12;
		
		doubleObj.add(a);
		doubleObj.add(b);
		doubleObj.add(c);
		
		System.out.println("Double Value (a): " + doubleObj.get(0));
		System.out.println("Double Value (b): " + doubleObj.get(1));
		System.out.println("Double Value (c): " + doubleObj.get(2));

		System.out.println("----------------------------------------");
		
		int x = (int) a;
		int y = (int) b;
		int z = (int) c;
		
		integerObj.add(x);
		integerObj.add(y);
		integerObj.add(z);
		
		System.out.println("Integer Value (a): " + integerObj.get(0));
		System.out.println("Integer Value (b): " + integerObj.get(1));
		System.out.println("Integer Value (c): " + integerObj.get(2));
		

	}

}
