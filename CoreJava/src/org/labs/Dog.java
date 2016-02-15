package org.labs;

public class Dog {

	Collar c;
	String name;

	private void go(Dog dog) {
		c = new Collar();
		dog.setName("Aiko");
	}
	
	private void getNewName(Dog newName) {
		newName.setName("Pluto");
	}


	private void setName(String dogName) {
		name = dogName;

	}

	public static void main(String args[]) {

		Dog d = new Dog();
		d.go(d);
		System.out.println(d.name);
		
		d.getNewName(d);
		
		System.out.println(d.name);
	}
	

}
