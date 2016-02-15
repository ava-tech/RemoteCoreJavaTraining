package org.cert;

public class D {
	
	public void abc(){
		
	}
	
	int x = 014;
	
	void go(final int i) {
		System.out.println("==>" + i/x);
		
	}
	
	public static void main(String[] args){
		
		int m = 10;
		float f = m;
		System.out.println("int to float (No Cast Required): " + f);
		byte b = 10;
		f = b;
		System.out.println("byte to float (No Cast Required): " + f);
		short shrt = 10;
		f = shrt;
		System.out.println("short to float (No Cast Required): " + f);
		char c = 10;
		f = c;
		System.out.println("char to float (No Cast Required): " + f);
		
		D d1 = new D();
		
		d1.go(24);
		
		StringBuilder s = new StringBuilder("Java");
		
		s.append(" SE 6");
		s.delete(8,9);
		s.insert(8, "7");
		s.setLength(8);
			
		System.out.println(s.capacity());
		
		String ss = "Java";
		ss.concat(" SE 7");
		
		
		System.out.println(ss.length() + ss);
	}

	

}
