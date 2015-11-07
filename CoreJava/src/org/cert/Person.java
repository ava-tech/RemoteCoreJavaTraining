package org.cert;

public class Person {
	
	private String name;

	public Person() {
		this.name = "John Smith";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public class Address{
		
		public String city = " New York City";
		
		public String getPersonInfo(){
			return name + city;
		}
	}
}
