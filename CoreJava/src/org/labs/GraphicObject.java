package org.labs;

public abstract class GraphicObject implements DemoInterface {
	
	static double pie = 3.14;
	
	int instanceVarP = 10;
	
	public void draw(){
		System.out.println("Drawing ...");
	}

}
