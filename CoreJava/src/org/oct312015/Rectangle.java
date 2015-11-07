package org.oct312015;

public class Rectangle extends Shape {

	private String color;
	private String name;

	public Rectangle(String c) {
		this.color = c;
		this.name = "Rectangle";
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return color;
	}

	public void getSides() {
		System.out.print("I have 4 sides");
	}

	@Override
	public int getSize() {
		return super.getSize();
	}

}
