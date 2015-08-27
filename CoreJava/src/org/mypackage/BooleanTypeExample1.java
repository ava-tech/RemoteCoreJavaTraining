package org.mypackage;

/*
 * boolean type has two possible values: true or false
 * Java reserve the words true and false to represent 
 * boolean values
 * 
 */

public class BooleanTypeExample1 {
	
	static boolean b;       //no assignment
	boolean isEmpty = true; //value assigned
	
	//static Boolean isEmpty = new Boolean("true");

	public static void main(String[] args) {
		
		System.out.println(b);
		
		//System.out.println(isEmpty);
		System.out.println(new BooleanTypeExample1().isEmpty);

	}

}
