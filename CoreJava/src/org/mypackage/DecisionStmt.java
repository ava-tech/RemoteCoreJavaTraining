package org.mypackage;

import java.util.Scanner;

public class DecisionStmt {

	final static int ZERO = 0;
	static String answer;

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Game of X-Factor ");
		System.out.print("Are we ready to begin: (Y/N): ");
		answer = s.next();

		while (answer.equalsIgnoreCase("Y")) {

			System.out.print("\nYour Score: ");
			int yourScore = s.nextInt();

			System.out.print("\nComputer Score: ");
			int computerScore = s.nextInt();

			if (yourScore != ZERO || computerScore != ZERO) {

				if (yourScore == computerScore) {
					System.out.println("Game Tie ...");
					playAgain();
				} else {

					if (yourScore > computerScore) {
						System.out.println("You Win ...");
						playAgain();
					}

					if (yourScore < computerScore) {
						System.out.println("You Lose ...");
						playAgain();
					}

				}

			} else {
				System.out.println("Let's begin the game ...");
				gameStart();
			}

		}

		System.out.println("*** GAME OVER ***");

	}

	private static void gameStart() {
		answer = "Y|y";
	}

	private static void playAgain() {
		System.out.print("Do want to play again: (Y/N): ");
		answer = s.next();
	}

}
