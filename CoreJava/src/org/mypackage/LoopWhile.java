package org.mypackage;

public class LoopWhile {
	
	

	public static void main(String[] args) {
		
		Person john = new Person("John");

		boolean roomCheck = false;
		int roomNumber = 0;

		for (int i = 1; i < 20; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				roomCheck = true;
				roomNumber = i;
				john.setRoomNumber(i);
			}
			
			roomNumber = i;
						
			do{
				System.out.println("Checking the room status ...");
				
				if(roomCheck == true){
					System.out.println("Room Number: " + roomNumber + " is ON !!!");
					System.out.println("Room Booked By: " + john.getName() + ", and room number is " + john.getRoomNumber());
					roomCheck = false;
				}
				else{
					System.out.println("Room Number: " + roomNumber + " is OFF");
				}
				
			}while(roomCheck);
		}//end of for

	}
}
