package org.offline.labs;

public class VariableExampleTwo {
	
	
	public String greeting = "Welcome";
	public String month = "September";
	
	public void greeting(){
		
		String day = "Saturday";
		String month = "August";
		
		System.out.println("Month is: " + month + " and day is: " + day);
		
	}
	
	public void dummy(){
		System.out.println("Day is :" + month + greeting);
	}
	

}
