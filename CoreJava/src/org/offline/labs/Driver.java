package org.offline.labs;

public class Driver {

	public static void main(String[] args) {
		
		Cup myCup = new Cup();
		
		System.out.println(myCup.name);
		System.out.println(myCup.getCupName() + Cup.size);
		
		
		Cup mainStreet123 = new Cup();
		Cup east23street = new Cup();
		
		mainStreet123.name = "coffee cup";
		east23street.name = "tea cup";
		
		System.out.println(mainStreet123.name);
		System.out.println(east23street.name);


	}

}
