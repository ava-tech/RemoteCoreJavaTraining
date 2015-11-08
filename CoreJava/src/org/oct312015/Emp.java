package org.oct312015;

import java.util.ArrayList;
import java.util.List;

public class Emp {

	// Instance field
	private String name;
	private double baseSalary;
	Address address = new Address();

	public Emp(String s, double salary) {
		this.name = s;
		this.baseSalary = salary;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double getNetSalary() {
		double x, y;
		x = this.baseSalary;
		y = 0.0;
		if (75000 < x)
			y = x * .9;
		return y;
	}

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<Emp>();

		Emp john = new Emp("John Smith", 100000);
		Emp adam = new Emp("Mohammad Ali", 120000);

		john.address.setAddress("200 Main Street", "Jamaica", "NY", 11432);
		adam.address.setAddress("111 Springfield Blvd", "Jamaica", "NY", 11132);

		empList.add(john);
		empList.add(adam);

		for (Emp obj : empList) {
			System.out.println("my name is: " + obj.getName()
					+ " and my net salary is: " + obj.getNetSalary()
					+ " and my address is: " + obj.address.getAddress1() + " "
					+ obj.address.getCity() + " " + obj.address.getState() + " "
					+ obj.address.getZip());
		}
		
		Emp emp = new Emp("David Williams", 950000);
		emp.address.setAddress("32W 63rd Street", "New York", "NY", 11102);

		System.out.println("my name is: " + emp.getName()
				+ " and my net salary is: " + emp.getNetSalary()
				+ " and my address is: " + emp.address.getAddress1() + " "
				+ emp.address.getCity() + " " + emp.address.getState() + " "
				+ emp.address.getZip());

	}
}
