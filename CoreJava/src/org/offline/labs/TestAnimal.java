package org.offline.labs;


public class TestAnimal {

	public static void main(String[] args) {
		
		//Animal cat = new Cat(); //reference cat is a type of Animal. The object that "cat" reference to is Cat
		//Animal dog = new Dog(); //reference dog is a type of Animal. The object that "dog" reference to is Dog
		
		//cat.speak();
		//dog.speak();
		
		Animal a[] = new Animal[2];
		
		a[0] = new Cat();
		a[1] = new Dog();
		
		for(int i=0; i<a.length; i++){
			a[i].speak();
		}
		
		//Animal animal = new Animal();
		Animal myDog = new Dog();
		
		myDog.speak();
		((Dog)myDog).eatBone();

		
	}

}
