package org.mypackage;

public class DonutFactory {

	public static void main(String[] args) {
		
		Donut bostonCream = new Donut("Round", 2.5, "Boston Cream");
		Donut myDonut = new Donut("Round", 2.5, "New York Style");
		
		
		bostonCream.setShape("Square");
		
		System.out.println("Name of the Your Donut:" + bostonCream.getName() + ", shape is: " + bostonCream.getShape());
		
		System.out.println("Name of the My Donut:" + myDonut.getName() + ", shape is: " + myDonut.getShape());


	}

}
