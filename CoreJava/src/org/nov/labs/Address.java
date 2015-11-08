package org.nov.labs;

public class Address{
	
	private String address1;
	private String city;
	private String state;
	private int zip;
	
	public String getAddress1() {
		return address1;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public void setAddress(String address1, String city, String state, int zip){
		
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}

}
