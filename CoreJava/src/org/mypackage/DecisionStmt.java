package org.mypackage;

import java.util.Scanner;

public class DecisionStmt {
	
	final static int ZERO = 0; 

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Your Score: ");
		int yourScore = s.nextInt();

		System.out.print("Computer Score: ");
		int computerScore = s.nextInt();

		if (yourScore != ZERO && computerScore != ZERO) {

			if (yourScore == computerScore) {
				System.out.println("Game Tie ...");
			} else {

				if (yourScore > computerScore) {
					System.out.println("You Win ...");
				}

				if (yourScore < computerScore) {
					System.out.println("You Lose ...");
				}

			}

		} else {
			System.out.println("Let's begin the game ...");
		}

	}

}
