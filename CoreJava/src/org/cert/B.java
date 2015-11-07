package org.cert;

public class B extends A {
	@Override
	public boolean isDisplayed() {
		return false;
	}
	
	public static void main(String[] args){
		B b = new B();
		System.out.println(b.isDisplayed());
	}
}
