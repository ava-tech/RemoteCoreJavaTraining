package org.online.labs;

abstract class Person implements ChuchFather, BiologicalFather {

	private String name;
	private int age;
	private int children;


	// constructor
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}

	public void goToChurchOnSunday() {
		System.out.println("unknown activity on Sunday !!!");

	}

	public Integer getNumberOfChildren(int n) {
		this.children = n;
		return children;
	}
	
	public void eat(){
		System.out.println("eat solid food");
	}

	
}
