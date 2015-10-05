package org.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DemoReadFile {

	public static void main(String[] args) {
		
		File file = new File("C:/SampleFiles/README.txt");
		
		Scanner inputFile;
		
		try {
			inputFile = new Scanner(file);
			
			String str = null;

			//Reading file line by line
			while(inputFile.hasNext()){
				//str = inputFile.nextLine();
				System.out.println(inputFile.nextLine());
				
			}
			
			System.out.println("\nWhich line I am reading: " + str);

			inputFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			int i = System.in.read();
			System.out.println("Enter Data:" + (char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
