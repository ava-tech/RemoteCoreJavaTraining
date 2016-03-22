package org.offline.labs;

class Bar extends Foo {
	public void method() {
		System.out.println("in Bar");
	}
	
	public static void main(String[] args){
		Foo f = new Bar();
		Bar b = new Bar();
		
		Foo ff = new Foo();

		f.method();
		b.method();
		
		ff.method();
		
	}
}