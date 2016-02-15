package org.labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFile {

	public static void main(String[] args) {

		try {
	         Scanner in = new Scanner(new File("test.in"));
	         in.close();
	         // do something if no exception ...
	         // you main logic here in the try-block
	         
	      } catch (FileNotFoundException ex) { //error handling separated from the main logic
	    	  ex.printStackTrace();             //print the stack trace
	      }finally{
	    	  // close file;
	    	  // always try to close the file
	    	  // always executes
	      }
		
	}
}
