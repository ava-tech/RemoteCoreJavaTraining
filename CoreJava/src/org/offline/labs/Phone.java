package org.offline.labs;

public abstract class Phone implements PhoneMacId {
	
	private String name;
	
	public Phone(String n){
		this.name = n;
	}

	public String getName() {
		return name;
	}
	
	public String makeCall(){
		return this.getName() + ", I can make call";
	}
	
	abstract String sendMail();
	

}
