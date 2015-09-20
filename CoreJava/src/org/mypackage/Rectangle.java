package org.mypackage;

public class Rectangle extends Figure{
	
	public Rectangle(double d1, double d2) {
		super(d1, d2);
	}

	@Override
	public double area() {
		return dim1 * dim2;
	}

}
