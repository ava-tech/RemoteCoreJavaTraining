package org.mypackage;

public class AbstractFigureMain {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2.5, 1.5); 
		System.out.println("Area of a Rectangle: " + r.area());
		
		Triangle t = new Triangle(1.0, 3.5);
		System.out.println("Area of a Triangle: " + t.area());

	}

}
