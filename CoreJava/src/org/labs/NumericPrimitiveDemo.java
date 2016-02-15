package org.labs;


public class NumericPrimitiveDemo {
	
	static int x = 9;
	
	private int varWithUnderScore = 1_000_000;
	private int varWithoutUnderScore = 1000000;
	
	//private int underScoreAtBeginning = _1_000_000; //Wrong: Compiler Error
	//private int underScoreAtEnd = 1_000_000_; //Wrong: Compiler Error
	
	private double withUnderScore1 = 1_4.5;
	private double withUnderScore2 = 1_4.5_6;
	//private double withUnderScore = 14_.5; //Wrong: Compiler Error
	//private double withUnderScore = _14.5; //Wrong: Compiler Error
	//private double withUnderScore = 14._5; //Wrong: Compiler Error
	//private double withUnderScore = 14.5_; //Wrong: Compiler Error
	
	private int b1 = 0B101010;
	private int b2 = 0b101010;
	
	private char charVar1 = '\"';
	private char charVar2 = '\n';
	private char charVar3 = '\t';
	
	private byte byte1 = 27;
	private byte byte2 = (byte) 27;

	public static void main(String[] args) {
		
		//int x = 2;
		
		NumericPrimitiveDemo npd = new NumericPrimitiveDemo();
		
		System.out.println("integer with (1_000_000): " + npd.varWithUnderScore);
		System.out.println("integer with (1000000):   " + npd.varWithoutUnderScore);
		
		System.out.println("double with (1_4.5): " + npd.withUnderScore1);
		System.out.println("double with (1_4.5_6): " + npd.withUnderScore2);
		
		System.out.println("Decimal of 0B101010: " + npd.b1);
		System.out.println("Decimal of 0b101010: " + npd.b2);
		
		System.out.println("Character of backslash: " + npd.charVar1);
		System.out.println("Character of new line: " + npd.charVar2);
		System.out.println("Character of keyboard tab: " + npd.charVar3);
		
		System.out.println("Byte of 27: " + npd.byte1);
		System.out.println("Byte of 27: " + npd.byte2);

	}

}
