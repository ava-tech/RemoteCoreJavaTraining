package org.labs;

public class ExceptionHandlingOne {

	public static void main(String[] args) {

		doStuff();
	}

	private static void doStuff() {

		doMoreStuff();
	}

	private static void doMoreStuff() {
		try{
			int x = 5/0;
			System.out.println(x);
		}catch(ArithmeticException ae){
			System.out.println("Cannot divide by zero " + ae);
		}
		
	}

}
