package org.cert;

public class Main {

	public static void main(String[] args) {
		
		Parent bird = new Child("Bird");
		Parent homer = new Parent();
		
		System.out.println(bird.getNewName());
		System.out.println(homer.getNewName());
		System.out.println(Child.name);
		System.out.println(Parent.name);
		
		homer.setNewName("Lisa");
		
		System.out.println(bird.getNewName());
		System.out.println(homer.getNewName());
		System.out.println(Child.name);
		System.out.println(Parent.name);
		

	}

}
