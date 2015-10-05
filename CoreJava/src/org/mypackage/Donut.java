package org.mypackage;

public class Donut {
	
	private String shape;
	private double size;
	private String name;
	
	public Donut(String shape, double size, String name) {
		this.shape = shape;
		this.size = size;
		this.name = name;
	}
	
	public double getSize() {
		return size;
	}


	public String getName() {
		return name;
	}

	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String toString() {
		return "Donut [name=" + name + "]";
	}

}
