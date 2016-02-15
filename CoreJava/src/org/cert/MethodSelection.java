package org.cert;


class CorbaComponent{
	
	String ior;
	
	CorbaComponent(){
		startUp("IOR");
	}
	
	void startUp(String s){
		ior = s;
	}
	
	void print(){
		System.out.println(ior);
	}
	
}

class OrderManager extends CorbaComponent{
	
	OrderManager(){
		
	}
	
	void startUp(String s){
		ior = gerIORFromURL(s);
	}
	
	String gerIORFromURL(String s){
		return "URL://" + s;
	}
}

public class MethodSelection {

	public static void main(String[] args) {
		start(new OrderManager());
		
		String s1 = "hello";
		String s2 = s1.replace('o', 'a');
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		System.out.println("String".replace('g', 'g') == "String");

	}

	static void start(CorbaComponent cc) {
		
		cc.print();
		
	}

}
