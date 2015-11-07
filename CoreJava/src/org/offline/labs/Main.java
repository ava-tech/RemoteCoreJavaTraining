package org.offline.labs;

public class Main {

	public static void main(String[] args) {
		
		Table myTable = new Table();
		Table yourTable = new Table();
		
		System.out.println("Who are you: " + myTable.toString());
		
		if (myTable.canFold())
			System.out.println("You can folde me !!!");
		else
			System.out.println("You cannot folde me !!!");
		
		myTable.setSize(45);
		myTable.setColor("blue");
		System.out.println("My table size is: " + myTable.getSize() + " sqr feet.");
		System.out.println("My table color is: " + myTable.getColor() + " !!!");
		
		
		System.out.println("Who are you: " + yourTable.toString());
		
		if (!yourTable.canFold())
			System.out.println("You can folde me !!!");
		else
			System.out.println("You cannot folde me !!!");
		
		yourTable.setSize(65);
		yourTable.setColor("red");
		System.out.println("Your table size is: " + yourTable.getSize() + " sqr feet.");
		System.out.println("Your table color is: " + yourTable.getColor() + " !!!");

		
		
/*		Hammer x = new Hammer("American");
		Hammer y = new Hammer("Chinese");
		
		x.setHead("Silver Head");
		x.setFace("Plain");
		x.setClaw("Round and Spikey");
		x.setHandle("Wooden");

		y.setHead("Steel Head");
		y.setFace("Plain");
		y.setClaw("Round and Spikey");
		y.setHandle("Steel");


		System.out.print(x.getName() + " hammer has "+  x.getHandle() + " handle, and can ");
		x.canBreak();
		System.out.print(y.getName() + " hammer has "+ y.getHandle() + " handle, and can ");
		y.canBreak();
*/		
		
		
		
		
/*		VariableExampleThree myPrinter = new VariableExampleThree();
		
		VariableExampleThree yourPrinter = new VariableExampleThree();
		
		myPrinter.printerName = "My Printer";
		yourPrinter.printerName = "My Printer";
		
		System.out.println("My Printer: " + myPrinter.printerName);
		System.out.println("My Printer: " + yourPrinter.printerName);
*/		

	}

}
