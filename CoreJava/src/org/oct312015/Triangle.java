package org.oct312015;

public class Triangle extends Rectangle {

	private String name;

	public Triangle(String c) {
		super(c);
		this.name = "Triangle";
	}

	public String getName() {
		return this.name;
	}

	public void getSides() {
		System.out.print("I have 3 sides");
	}

}
