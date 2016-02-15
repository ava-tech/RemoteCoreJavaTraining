package org.cert;

import java.util.ArrayList;

class GradeStudent {
	
	ArrayList<Integer> scores;
	private double average;
	
	public ArrayList<Integer> getScores(){
		return scores;
	}
	
	public double getAverage(){
		return average;
	}
	
	private void computeAverage(){
		average = 25.5;
	}
	
	public GradeStudent(){
		computeAverage();
	}
}

public class Student {

	public static void main(String[] args) {
		
		GradeStudent gs = new GradeStudent();
		System.out.println(gs.getAverage());
		
		char c = 10;
		int i = c;
		
		System.out.print("c : " + c );
		System.out.print("i : " +i);
		
		c = 'a';
		i = c;
		System.out.print("\nc : " + c );
		System.out.print("\ni : " +i);


	}

}
