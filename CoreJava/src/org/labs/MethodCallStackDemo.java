package org.labs;

public class MethodCallStackDemo {
	   public static void main(String[] args) {
	      System.out.println("Enter main()");
	      methodA();
	      System.out.println("Exit main()");
	   }
	 
	   public static void methodA() {
	      System.out.println("Enter methodA()");
	      try{
	      methodB();
	      }catch(Exception e){
		    	 System.out.println("A: Exception catch here ..."); 
		      }
	      System.out.println("Exit methodA()");
	   }
	 
	   public static void methodB() {
	      System.out.println("Enter methodB()");
	      methodC();
	      System.out.println("Exit methodB()");
	   }
	 
	   public static void methodC() {
	      System.out.println("Enter methodC()");
	      // divide-by-0 triggers an ArithmeticException
	      System.out.println(1 / 0);  
	      System.out.println("Exit methodC()");
	   }
	}