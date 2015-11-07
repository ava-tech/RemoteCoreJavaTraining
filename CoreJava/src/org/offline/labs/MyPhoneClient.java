package org.offline.labs;

public class MyPhoneClient {
	
	

	public static void main(String[] args) {
		
		Phone obj = new SmartPhone("IPhone");
		
		System.out.println(obj.uniqueIdentiricationNumber() + obj.getName());

	}

}
