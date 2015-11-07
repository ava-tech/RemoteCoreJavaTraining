package org.offline.labs;

public class Table {
	
	public String toString() {
		return "I am a Table";
	}

	private String shape;
	private int size;
	private String color;
	
	public boolean canFold(){
		return false;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
