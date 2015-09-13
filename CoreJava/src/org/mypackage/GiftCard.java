package org.mypackage;

public class GiftCard {
	
	String name;
	int balance;
	
	public GiftCard(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void buyGoods(int amount){
		
		if(balance > amount)
			this.balance = balance - amount;
		else
			this.balance = 0;
	
	}

}
