package org.cert;

import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;

public class ExcepDemo2 {
	
	public void meth(byte b){
		System.out.println("I am byte");
	}
	
	public void meth(int i){
		System.out.println("I am int");
	}
	
	public void objMeth(Object o){
		System.out.println("I am object");
	}

	public void objMeth(IOException e){
		System.out.println("I am IOException");
	}
	
	public void objMeth(MalformedURLException e){
		System.out.println("MalformedURLException");
	}
	
	public void objMeth(EOFException e){
		System.out.println("EOFException");
	}


	public static void main(String[] args) {
			
		ExcepDemo2 ed = new ExcepDemo2();
		ed.meth(65);
		ed.meth((byte) 65);
		
		//ed.objMeth(null);
	}
}
