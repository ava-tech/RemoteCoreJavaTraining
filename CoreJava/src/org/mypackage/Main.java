package org.mypackage;

public class Main {

	public static void main(String[] args) {
		
		GiftCard alice = new GiftCard("Macy's", 100);	
		GiftCard bob = alice;
		
		System.out.println("Before Shopping: Alice's Gift Card name: " + alice.name);
		System.out.println("Before Shopping: Alice's Gift Card balance: " + alice.balance);
		
		System.out.println("Before Shopping: Bob's Gift Card name: " + bob.name);
		System.out.println("Before Shopping: Bob's Gift Card balance: " + bob.balance);
		
		bob.buyGoods(60); //Bob bought $60 items from Macy's
		
		System.out.println("After Shopping: Alice's Gift Card name: " + alice.name);
		System.out.println("After Shopping: Alice's Gift Card balance: " + alice.balance);
		
		System.out.println("After Shopping: Bob's Gift Card name: " + bob.name);
		System.out.println("After Shopping: Bob's Gift Card balance: " + bob.balance);
		
		alice = new GiftCard("Target", 75);
		
		//what is the name of Bob's gift card
		System.out.println("Bob's Gift Card name: " + bob.name + " balance: " + bob.balance);
		
		//what is the name of Alice's gift card
		System.out.println("Alice's Gift Card name: " + alice.name + " balance: " + alice.balance);
		
		bob = alice;
		System.out.println("Bob's Gift Card name: " + bob.name + " balance: " + bob.balance);
		System.out.println("Alice's Gift Card name: " + alice.name + " balance: " + alice.balance);
		
	}
}
