package org.mypackage;

public class Triangle extends Figure{

	public Triangle(double d1, double d2) {
		super(d1, d2);
	}

	@Override
	double area() {
		return dim1 * dim2 / 2;
	}

}
