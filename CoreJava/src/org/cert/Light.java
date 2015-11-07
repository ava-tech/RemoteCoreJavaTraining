package org.cert;

public class Light {
	//Instance fields
	int noOfWatts;
	private boolean indicator;
	protected String location;
	
	//Static fields
	private static int counter;
	
	//Constructor
	public Light(){
		noOfWatts = 50;
		indicator = true;
		location = "X";
		counter++;
	}
	
	//Instance methods
	public void switchOn(){ indicator = true;}
	public void switchOff(){ indicator = true;}
	public boolean isOn(){ return indicator;}
	private void printLocation(){
		System.out.println("Location: " + location);
	}
	
	//Static methods
	public static void writeCount(){
		Light light = new Light();
		light.printLocation();
		System.out.println("Number of lights: " + counter);
	}
}
