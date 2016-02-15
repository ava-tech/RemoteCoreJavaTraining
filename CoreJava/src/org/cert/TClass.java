package org.cert;

class Tor{
	int fi = 100;
}
public class TClass extends Tor{
	
	int fi = 200;
	
	volatile int root = 1;

	public static void main(String[] args) {
		
		switch(new TClass().root){
		
		}
		TClass t1 = new TClass();
		Tor t2 = new TClass();
		
		
		System.out.println(t1.fi);
		System.out.println(t2.fi);
		
		System.out.println(new TClass().fi);
		
		//System.out.println(t.fi);
		//System.out.println( ( (Tor) t ).fi );
		
		
		//Tor tt = new Tor();
		//System.out.println( new TClass().fi);
		//System.out.println(tt.fi);
		
	}

}
