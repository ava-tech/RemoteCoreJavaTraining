package org.cert;

public class Employee extends Person {
	
	

	public static void main(String[] args){
		
		Employee emp = new Employee();	
		System.out.println(emp.getName());
		
		Employee.Address address = emp.new Address();
		System.out.println(address.getPersonInfo());
	}
}

