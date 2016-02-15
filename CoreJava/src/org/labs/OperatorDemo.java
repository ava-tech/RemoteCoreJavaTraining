package org.labs;

public class OperatorDemo {

	public static void main(String[] args) {
		
	    /*
	     * Following 
	     
		=   >   <   !   ~   ?   :
	    
	    ==  <=  >=  !=  &&  ||  ++  --
	    
	    +   -   *   /   &   |   ^   %   <<   >>   >>>
	    
	    +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=
	    
	     */
		
		//To assign value
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		if(s1 == s2){
			System.out.println("String matched:" + s1 + s2);
		}
		
		if(s1.equals(s2)){
			System.out.println("String Object matched:" + s1 + " " + s2);
		}
		
		boolean isSwitchOn = false;
		//isSwitchOn = true ? s1.equals(s2) : false;
		
		System.out.println(isSwitchOn);
		
		int n = 10;
		
		System.out.println("Pre Increment: " + ++n);
		System.out.println("After pre increment: " + n);
		
		n = 10;
		
		System.out.println("Post Increment: " + n++);
		System.out.println("After Post Increment: " + n);
		
		n = 10;
		n =+ n;
		System.out.println(n);
		
		n = 10;
		n += 5;
		System.out.println(n);
		n -= 5;
		System.out.println(n);
		
		n = 10;
		System.out.println("--->:"+n);
		n =+ 5;
		System.out.println("--->:"+n);
		n =- 5;
		System.out.println("--->:"+n);
	}
}
