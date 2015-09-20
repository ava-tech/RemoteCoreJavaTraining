package org.mypackage;

public abstract class Figure {
	
	public double dim1;
	public double dim2;
	
	public Figure(double d1, double d2) {
		this.dim1 = d1;
		this.dim2 = d2;
	}
	
	abstract double area();
}
