package org.mypackage;

import java.util.Scanner;

public class DecisionStmt {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Your Score: ");
		int yourScore = s.nextInt();

		System.out.print("Computer Score: ");
		int computerScore = s.nextInt();

		if (yourScore != 0 && computerScore != 0) {

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
