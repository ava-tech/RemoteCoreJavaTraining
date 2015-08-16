package org.online.labs;

public class Adult extends Person {

	public Adult(String name) {
		super(name);
	}

	@Override
	public void goToChurchOnSunday() {
		System.out.println("Adult goes to church !!!");
	}

}
