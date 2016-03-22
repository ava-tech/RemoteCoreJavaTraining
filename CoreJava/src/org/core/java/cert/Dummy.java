package org.core.java.cert;

public class Dummy {
	
	
	public static void main(String[] args) {
		
		String a[] = new String[3];
		
		a[0] = "good";
		a[1] = "bye";
		a[2] = "friend!";
		
		for(int i=0; i < a.length; i++){
			
			System.out.println( i == 0 ? a[i] : " " + a[i]);
			
		}

	}

}
