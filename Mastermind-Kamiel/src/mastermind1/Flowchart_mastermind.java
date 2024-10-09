package mastermind1;

import java.util.Scanner;

public class Flowchart_mastermind {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int black = 7;
		int white = 8;
		int empty = 0;

		System.out.println("Maker, Create combination.");
		System.out.println("Red = 1");
		System.out.println("Blue = 2");
		System.out.println("Yellow = 3");
		System.out.println("Purple = 4");
		System.out.println("Green = 5");
		System.out.println("Orange = 6");
		int[] makerCombinationAnswer = new int[4];
		int verify;

		do {
			System.out.println("Create combination");
			for (int i = 0; i < makerCombinationAnswer.length; i++) {
				int in = input.nextInt();

				if (in > 6) {
					in = 6;
				}
				if (in < 1) {
					in = 1;
				}
				makerCombinationAnswer[i] = in;
			}
			System.out.println("" + makerCombinationAnswer[0] + makerCombinationAnswer[1] + makerCombinationAnswer[2]
					+ makerCombinationAnswer[3]);
			System.out.println("Are you certain?");
			System.out.println("1. Yes   2. No");
			verify = input.nextInt();
			if (verify == 1) {
			} else {
				if (verify == 2) {
				} else {
				}
			}
		} while (verify == 2);

		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out
				.println("Red = 1. " + "Blue = 2. " + "Yellow = 3. " + "Purple = 4. " + "Green = 5. " + "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");

		int[] breakerSpaces = new int[4];
		int round = 0;
		int roundOpposite = 10;

		do {

			for (int i = 0; i < breakerSpaces.length; i++) {
				int in = input.nextInt();

				if (in >= 6) {
					in = 6;
				} else if (in <= 1) {
					in = 1;
				}
				breakerSpaces[i] = in;
			}
			System.out.println("" + breakerSpaces[0] + breakerSpaces[1] + breakerSpaces[2] + breakerSpaces[3]);

			for (int check = 0; check < breakerSpaces.length; check++) {

				verify = breakerSpaces[check];

				// 1e
				if (verify == makerCombinationAnswer[0]) {
					breakerSpaces[0] = white; // als makercombination[0] gelijk is aan verify - juiste kleur, juiste
												// plek
				} else {
					if (verify == makerCombinationAnswer[1] 
							|| verify == makerCombinationAnswer[2]
							|| verify == makerCombinationAnswer[3])
						breakerSpaces[0] = black;
				}
				// 2e
				if (verify == makerCombinationAnswer[1]) {
					breakerSpaces[1] = white;
					
				} else {
					if (verify == makerCombinationAnswer[1] 
							|| verify != makerCombinationAnswer[2]
							|| verify != makerCombinationAnswer[3])
						breakerSpaces[1] = black;
				}
				// 3e
				if (verify == makerCombinationAnswer[2]) {
					breakerSpaces[2] = white;
					
				} else {
					if (verify == makerCombinationAnswer[2] 
							|| verify != makerCombinationAnswer[2]
							|| verify != makerCombinationAnswer[3])
						breakerSpaces[2] = black;
				}
				// 4e
				if (verify == makerCombinationAnswer[3]) {
					breakerSpaces[3] = white;
				} else {
					if (verify == makerCombinationAnswer[3] 
							|| verify != makerCombinationAnswer[2]
							|| verify != makerCombinationAnswer[3])
						breakerSpaces[3] = black;
				}
			}

			System.out.println("8 is white and 7 is black");
			System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
			System.out.println("" + breakerSpaces[0] + breakerSpaces[1] + breakerSpaces[2] + breakerSpaces[3]);

			if (breakerSpaces[0] == white && breakerSpaces[1] == white && breakerSpaces[2] == white
					&& breakerSpaces[3] == white) {
				System.out.println("Breaker wins.");
			}

			else
				round++;
			roundOpposite--;
			System.out.println("Round " + round);
			System.out.println("You have " + roundOpposite + " tries left");

		} while (round < 10);

	}

}