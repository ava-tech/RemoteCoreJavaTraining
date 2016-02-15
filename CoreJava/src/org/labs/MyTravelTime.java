package org.labs;

public class MyTravelTime extends TimeTravel {
	
	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
    	
    	MyTravelTime myCat = new MyTravelTime();
    	//TimeTravel p = new MyTravelTime();
    	
    	
    	TimeTravel myAnimal = myCat;
    	//TimeTravel.testClassMethod();
    	//MyTravelTime.testClassMethod();
        myAnimal.testInstanceMethod();
        
        //p.testInstanceMethod();
    }

}
