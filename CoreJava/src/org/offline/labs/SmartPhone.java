package org.offline.labs;

public class SmartPhone extends Phone {

	public SmartPhone(String n) {
		super(n);
	}

	public String makeCall() {
		return ", I can make WIFI call";
	}

	String sendMail() {
		return ", I can send Email";
	}

	public String uniqueIdentiricationNumber() {
		
		return "ABC-123 ";
		
	}

}
