package org.online.labs;

public class Baby extends Person {

	public Baby(String name) {
		super(name);
	}

	public String cannotWalk() {
		return "Baby cannot walk";
	}

	public void eat() {
		System.out.println("Baby eat baby food");
	}

	@Override
	public void goToChurchOnSunday() {
		System.out.println("Baby don't go to church !!!");
	}

	@Override
	public Integer getNumberOfChildren(int n) {
		return 0;
	}
	
	

}
