package org.nov.labs;

import java.util.ArrayList;
import java.util.List;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		List<String> colorList = new ArrayList<String>();

		colorList.add("Purple");
		colorList.add("Orange");
		colorList.add("Green");

		String color;

		Rectangle rec = null;
		Triangle tri = null;

		for (Object o : colorList) {

			color = o.toString();
			rec = new Rectangle(color);

			rec.getSides();
			System.out.println(", my color is: " + rec.getColor() + ", I am "
					+ rec.getName());

			color = o.toString();
			tri = new Triangle(color);

			tri.getSides();
			System.out.println(", my color is: " + tri.getColor() + ", I am "
					+ tri.getName());

		}
		
		//Look, where reference variable is pointing into heap
		System.out.println(rec.getColor());
		System.out.println(tri.getColor());
		
		//Disconnecting reference from heap
		rec = null;
		tri = null;
		
		try{
			System.out.println(rec.getColor());
			System.out.println(tri.getColor());
		}catch(NullPointerException n){
			System.out.println("you disconnected the references: " + n.toString());
		}
		finally{
			System.out.println("Exiting the program, regardless there are some exceptions");
		}


	}
}
