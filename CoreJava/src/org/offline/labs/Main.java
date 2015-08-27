package org.offline.labs;

public class Main {

	public static void main(String[] args) {
		
		VariableExampleThree myPrinter = new VariableExampleThree();
		
		VariableExampleThree yourPrinter = new VariableExampleThree();
		
		myPrinter.printerName = "My Printer";
		yourPrinter.printerName = "My Printer";
		
		System.out.println("My Printer: " + myPrinter.printerName);
		System.out.println("My Printer: " + yourPrinter.printerName);
		

	}

}
