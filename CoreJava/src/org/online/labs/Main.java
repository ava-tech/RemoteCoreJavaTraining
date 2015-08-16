package org.online.labs;

public class Main {

	public static void main(String[] args) {

		Adult p = new Adult("Adam");

		Baby b = new Baby("Sunny");

		b.goToChurchOnSunday();
		b.eat();
		b.setAge(3);

		System.out.println("Baby Age: " + b.getAge() + ", and "
				+ b.cannotWalk());
		System.out.println("P------------>" + p.getName() + ", " + p.getAge());

		p.setAge(42); // setting value for p object

		if (p.getAge() > 30) {

			System.out.println("You are getting older !!!");
		}

		else {

			System.out.println("You are still young !!!");
		}

		System.out.println("P------------>" + p.getName() + ", " + p.getAge());

		System.out.println(b.getName() + " has " + b.getNumberOfChildren(2)
				+ " children");
		System.out.println(p.getName() + " has " + p.getNumberOfChildren(2)
				+ " children");

	}

}
