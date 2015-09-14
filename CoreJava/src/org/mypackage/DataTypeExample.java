package org.mypackage;

public class DataTypeExample {

	public static void main(String[] args) {
	
		//number group
		byte b = 127; 						// 8-bit = 1 byte; signed range (-2^7) ~ (+2^7 -1) = [-128 ~ 127] 
		short s = 1024; 					// 16-bit = 1 short; signed range (-2^15) ~ (+2^15 -1) = [-32,768 ~ 32,767]
		int i = 1048576;					// 32-bit = 1 integer; signed range (-2^31) ~ (+2^31 -1) = 
		long l = 1180591620717412345L;		// 64-bit = 1 long; signed range (-2^63) ~ (+2^63 -1) = 
		
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		

	}

}
