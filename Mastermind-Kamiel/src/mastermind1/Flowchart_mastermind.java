package mastermind1;

import java.util.Scanner;
import java.util.Random;

public class Flowchart_mastermind {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int black = 7;
		int white = 8;
		int empty = 0;

		int[] makerCombinationAnswer = new int[4];
		int verify;
		Random rand = new Random();

		for (int i = 0; i < makerCombinationAnswer.length; i++) {
			int in = rand.nextInt(6) + 1;
			makerCombinationAnswer[i] = in;
		}
		
		System.out.println("" + makerCombinationAnswer[0] + makerCombinationAnswer[1] + makerCombinationAnswer[2] + makerCombinationAnswer[3]);
		System.out.println("");
		System.out.println("The maker has made a combination");
		System.out.println("Red = 1. " + "Blue = 2. " + "Yellow = 3. " + "Purple = 4. " + "Green = 5. " + "Orange = 6. ");
		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");

		int[] breakerSpaces = new int[4];
		int round = 0; 
		int roundOpposite = 10;

		do {

			for (int i = 0; i < breakerSpaces.length; i++) {
				String in = input.next();
				int loopInput = Integer.parseInt(in);
				
				switch (loopInput) {
				case 1: case 2: case 3: case 4: case 5: case 6:
					breakerSpaces[i] = loopInput;
					break;
			    default: 
			    	breakerSpaces[i] = 6;
			    	System.out.println("Invalid input, changing it to 6");
				}
			}
			
			System.out.println("" + breakerSpaces[0] + breakerSpaces[1] + breakerSpaces[2] + breakerSpaces[3]);

			int[] checkSpaces = { -1, -1, -1, -1 };

			int randomnum = rand.nextInt(4);
			int check = breakerSpaces[randomnum];
			
			for (int i = 0; i < checkSpaces.length; i++) {
				verify = breakerSpaces[i];
				randomnum = rand.nextInt(4);
				check = breakerSpaces[randomnum];
				
				if (verify == makerCombinationAnswer[i]) {
					checkSpaces[i] = white;
					
				} else if (verify == makerCombinationAnswer[0] || verify == makerCombinationAnswer[1] || verify == makerCombinationAnswer[2] || verify == makerCombinationAnswer[3]) {
						checkSpaces[i] = black;
						
					} else { 
						checkSpaces[i] = empty;

					}
			}
			
			System.out.println("8 is white and 7 is black");
			System.out.println("if a space is white then you guessed right, if it's black then it's right but in the wrong position and if it's empty, then you guessed wrong");
			System.out.println("" + checkSpaces[0] + checkSpaces[1] + checkSpaces[2] + checkSpaces[3]);

			if (checkSpaces[0] == white && checkSpaces[1] == white && checkSpaces[2] == white
					&& checkSpaces[3] == white) {
				System.out.println("Breaker wins.");
				break;
			}

			else {
				round++;
			}
			roundOpposite--;
			System.out.println("Round " + round);
			System.out.println("You have " + roundOpposite + " tries left");

		} while (round < 10);
		
		System.out.println("Out of turns, Maker wins");

	}

}