package org.mypackage;

public class EnumExample {
	
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	
	Day day;

	public EnumExample(Day day) {
		this.day = day;
	}
	
	public void getDayInAWeek(){
		
		switch(day){
		case MONDAY:
			System.out.println("Working day");
			break;
		case TUESDAY:
			System.out.println("Working day");
			break;
		case WEDNESDAY:
			System.out.println("Working day");
			break;
		case THURSDAY:
			System.out.println("Working day");
			break;
		case FRIDAY:
			System.out.println("Working day");
			break;
		case SATURDAY:
			System.out.println("Enjoy your weekend !!!");
			break;
		case SUNDAY:
			System.out.println("Enjoy your weekend !!!");
			break;
		default:
			System.out.println("Unknown Day");
			break;
		}
	}


}
