package org.cert;

public class Child extends Parent {
	
	static String name = "John Junior";
	
	public Child(String name){
		super.setNewName(name);
	}
	
	public String getParentName(){
		return Parent.name;
	}
	
	public String getNewName(){
		return super.getNewName();
	}
}
