package org.mypackage;

public class Person {
	
	private String name;
	private int age;
	private int roomNumber;
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Person(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Person [name=" + name + ", getName()=" + getName() + "]";
	}

}
