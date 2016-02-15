package org.labs;

import static java.lang.Integer.*;

public class A {
	
	Integer i = 200;
	
	public final static void main(String[] args) {
		System.out.println("Hi");
		System.out.println(MAX_VALUE);
		
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(" i: "+i+", j: "+j);
			}
			System.out.println("");
		}
		
		System.out.println(24/14);
	}
	public static class B {
		static public void main(String[] args) {
			System.out.println("Hi");
		}
	}
	//private class C{}
	protected class D{}
	interface E{}
	abstract class F{}
}
