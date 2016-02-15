package org.labs;

public final class Day {
	
	public String name = "My Final Class";
	
	AAA a = new AAA();
	
	public void printMe(AAA a){
		AAA aa = a;
		
		a.instanceVarP = 20;
		
		System.out.println("Printing from Day: " + a.instanceVarP);
		
		System.out.println("Printing from here ...");
		aa.draw();
		System.out.println("Printing from here ...");
	}
	

}
