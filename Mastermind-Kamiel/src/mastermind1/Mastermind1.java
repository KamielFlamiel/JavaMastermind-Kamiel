package mastermind1;

import java.util.Scanner;

public class Mastermind1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean hideBox = true;
		boolean makerTurn = true;
		boolean breakerTurn = false;

		int red = 1;
		int blue = 2;
		int yellow = 3;
		int purple = 4;
		int green = 5;
		int orange = 6;
		int black = 7;
		int white = 8;

		System.out.println("Maker, Create combination.");
		System.out.println("Red = 1");
		System.out.println("Blue = 2");
		System.out.println("Yellow = 3");
		System.out.println("Purple = 4");
		System.out.println("Green = 5");
		System.out.println("Orange = 6");

		String verify = "";
		int makerCombinationAnswer1;
		int makerCombinationAnswer2;
		int makerCombinationAnswer3;
		int makerCombinationAnswer4;
		do {
			makerCombinationAnswer1 = sc.nextInt();
			makerCombinationAnswer2 = sc.nextInt();
			makerCombinationAnswer3 = sc.nextInt();
			makerCombinationAnswer4 = sc.nextInt();

			if (makerCombinationAnswer1 > 6) {
				makerCombinationAnswer1 = 6;
			}

			if (makerCombinationAnswer1 < 1) {
				makerCombinationAnswer1 = 1;
			}

			if (makerCombinationAnswer2 > 6) {
				makerCombinationAnswer2 = 6;
			}

			if (makerCombinationAnswer2 < 1) {
				makerCombinationAnswer2 = 1;
			}

			if (makerCombinationAnswer3 > 6) {
				makerCombinationAnswer3 = 6;
			}

			if (makerCombinationAnswer3 < 1) {
				makerCombinationAnswer3 = 1;
			}

			if (makerCombinationAnswer4 > 6) {
				makerCombinationAnswer4 = 6;
			}

			if (makerCombinationAnswer4 < 1) {
				makerCombinationAnswer4 = 1;
			}

			System.out.println("" + makerCombinationAnswer1 + makerCombinationAnswer2 + makerCombinationAnswer3
					+ makerCombinationAnswer4);
			System.out.println("Are you certain");
			System.out.println("1. yes   2. no");
			verify = sc.next();
		} while (!verify.equals("1"));

		if (hideBox == true) {
			makerCombinationAnswer1 = 0;
			makerCombinationAnswer2 = 0;
			makerCombinationAnswer3 = 0;
			makerCombinationAnswer4 = 0;
		}
		
		System.out.println("" +makerCombinationAnswer1 +makerCombinationAnswer2 +makerCombinationAnswer3 +makerCombinationAnswer4);
		
		makerTurn = false;
		breakerTurn = true;
		
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow1Space1;
		int breakerRow1Space2;
		int breakerRow1Space3;
		int breakerRow1Space4;
		
		breakerRow1Space1 = sc.nextInt();
		breakerRow1Space2 = sc.nextInt();
		breakerRow1Space3 = sc.nextInt();
		breakerRow1Space4 = sc.nextInt();

		int makerRow1Space1;
		int makerRow1Space2;
		int makerRow1Space3;
		int makerRow1Space4;

		int breakerRow2Space1;
		int breakerRow2Space2;
		int breakerRow2Space3;
		int breakerRow2Space4;

		int makerRow2Space1;
		int makerRow2Space2;
		int makerRow2Space3;
		int makerRow2Space4;

		int breakerRow3Space1;
		int breakerRow3Space2;
		int breakerRow3Space3;
		int breakerRow3Space4;

		int makerRow3Space1;
		int makerRow3Space2;
		int makerRow3Space3;
		int makerRow3Space4;

		int breakerRow4Space1;
		int breakerRow4Space2;
		int breakerRow4Space3;
		int breakerRow4Space4;

		int makerRow4Space1;
		int makerRow4Space2;
		int makerRow4Space3;
		int makerRow4Space4;

		int breakerRow5Space1;
		int breakerRow5Space2;
		int breakerRow5Space3;
		int breakerRow5Space4;

		int makerRow5Space1;
		int makerRow5Space2;
		int makerRow5Space3;
		int makerRow5Space4;

		int breakerRow6Space1;
		int breakerRow6Space2;
		int breakerRow6Space3;
		int breakerRow6Space4;

		int makerRow7Space1;
		int makerRow7Space2;
		int makerRow7Space3;
		int makerRow7Space4;

		int breakerRow8Space1;
		int breakerRow8Space2;
		int breakerRow8Space3;
		int breakerRow8Space4;

		int makerRow8Space1;
		int makerRow8Space2;
		int makerRow8Space3;
		int makerRow8Space4;

		int breakerRow9Space1;
		int breakerRow9Space2;
		int breakerRow9Space3;
		int breakerRow9Space4;

		int makerRow9Space1;
		int makerRow9Space2;
		int makerRow9Space3;
		int makerRow9Space4;

		int breakerRow10Space1;
		int breakerRow10Space2;
		int breakerRow10Space3;
		int breakerRow10Space4;

		int makerRow10Space1;
		int makerRow10Space2;
		int makerRow10Space3;
		int makerRow10Space4;

		breakerRow1Space1 = red;
		breakerRow1Space2 = red;
		breakerRow1Space3 = red;
		breakerRow1Space4 = red;

		makerRow1Space1 = white;
		makerRow1Space2 = white;
		makerRow1Space3 = white;
		makerRow1Space4 = white;

	}

}
