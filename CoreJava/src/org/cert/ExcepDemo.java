package org.cert;

import java.io.*;

class Open{
	public void doStuff()throws IOException{
		
	}
}

class OpenMind extends Open{
	public void doStuff(){
		System.out.println("My Parent has Checked on this. ");
	}
}

public class ExcepDemo {

	public static void main(String[] args) {
		
		OpenMind om = new OpenMind();
		om.doStuff();
		
		try {
			doStuff();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		System.out.println("=== Over ===");

	}
	
	public static void doStuff()throws Exception{
		
		System.out.println("Doing Stuff ...");
		if(8 > 5){
			throw new Exception("too high");
		}
		//System.out.println("Done Stuff ...");
	}
}
