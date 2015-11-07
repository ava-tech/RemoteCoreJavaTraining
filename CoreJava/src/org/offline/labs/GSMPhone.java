package org.offline.labs;

public class GSMPhone extends Phone {

	public GSMPhone(String n) {
		super(n);
	}
	
	public String makeCall() {
		return ", I cannot make WIFI call";
	}

	String sendMail() {
		
		return ", I cannot send Email";
	}

	public String uniqueIdentiricationNumber() {
		return "XYZ-123 ";

	}


}
