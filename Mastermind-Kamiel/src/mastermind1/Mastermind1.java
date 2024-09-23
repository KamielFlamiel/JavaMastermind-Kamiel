package mastermind1;

import java.util.Scanner;

public class Mastermind1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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
		

		System.out.println("" +makerCombinationAnswer1 +makerCombinationAnswer2 +makerCombinationAnswer3 +makerCombinationAnswer4);
		
	
		System.out.println(" ");
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
		
		int makerRow1Space1 = 0;
		int makerRow1Space2 = 0;
		int makerRow1Space3 = 0;
		int makerRow1Space4 = 0;
			
		if (breakerRow1Space1 > 6) {
			breakerRow1Space1 = 6;
		}

		if (breakerRow1Space1 < 1) {
			breakerRow1Space1 = 1;
		}

		if (breakerRow1Space2 > 6) {
			breakerRow1Space2 = 6;
		}

		if (breakerRow1Space2 < 1) {
			breakerRow1Space2 = 1;
		}

		if (breakerRow1Space3 > 6) {
			breakerRow1Space3 = 6;
		}

		if (breakerRow1Space3 < 1) {
			breakerRow1Space3 = 1;
		}

		if (breakerRow1Space4 > 6) {
			breakerRow1Space4 = 6;
		}

		if (breakerRow1Space4 < 1) {
			breakerRow1Space4 = 1;
		}
		
		System.out.println("" + breakerRow1Space1 + breakerRow1Space2 + breakerRow1Space3 + breakerRow1Space4);

		if (breakerRow1Space1 == makerCombinationAnswer1) {
			makerRow1Space1 = white;
		}
		
		else makerRow1Space1 = black;
		
		if (breakerRow1Space2 == makerCombinationAnswer2) {
			makerRow1Space2 = white;
		}
		
		else makerRow1Space2 = black;
		
		if (breakerRow1Space3 == makerCombinationAnswer2) {
			makerRow1Space3 = white;
		}
		
		else makerRow1Space3 = black;
		
		if (breakerRow1Space4 == makerCombinationAnswer4) {
			makerRow1Space4 = white;
		}
		
		else makerRow1Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow1Space1 + makerRow1Space2 + makerRow1Space3 + makerRow1Space4);
		
		
		if (makerRow1Space1 == white && makerRow1Space2 == white && makerRow1Space3 == white && makerRow1Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow2Space1;
		int breakerRow2Space2;
		int breakerRow2Space3;
		int breakerRow2Space4;
		
		breakerRow2Space1 = sc.nextInt();
		breakerRow2Space2 = sc.nextInt();
		breakerRow2Space3 = sc.nextInt();
		breakerRow2Space4 = sc.nextInt();

		int makerRow2Space1 = 0;
		int makerRow2Space2 = 0;
		int makerRow2Space3 = 0;
		int makerRow2Space4 = 0;
		
		if (breakerRow2Space1 > 6) {
			breakerRow2Space1 = 6;
		}

		if (breakerRow2Space1 < 1) {
			breakerRow2Space1 = 1;
		}

		if (breakerRow2Space2 > 6) {
			breakerRow2Space2 = 6;
		}

		if (breakerRow2Space2 < 1) {
			breakerRow2Space2 = 1;
		}

		if (breakerRow2Space3 > 6) {
			breakerRow2Space3 = 6;
		}

		if (breakerRow2Space3 < 1) {
			breakerRow2Space3 = 1;
		}

		if (breakerRow2Space4 > 6) {
			breakerRow2Space4 = 6;
		}

		if (breakerRow2Space4 < 1) {
			breakerRow2Space4 = 1;
		}
		
		System.out.println("" + breakerRow2Space1 + breakerRow2Space2 + breakerRow2Space3 + breakerRow2Space4);
		
		if (breakerRow2Space1 == makerCombinationAnswer1) {
			makerRow2Space1 = white;
		}
		
		else makerRow2Space1 = black;
		
		if (breakerRow2Space2 == makerCombinationAnswer2) {
			makerRow2Space2 = white;
		}
		
		else makerRow2Space2 = black;
		
		if (breakerRow2Space3 == makerCombinationAnswer2) {
			makerRow2Space3 = white;
		}
		
		else makerRow2Space3 = black;
		
		if (breakerRow2Space4 == makerCombinationAnswer4) {
			makerRow2Space4 = white;
		}
		
		else makerRow2Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow2Space1 + makerRow2Space2 + makerRow2Space3 + makerRow2Space4);
		
		
		if (makerRow2Space1 == white && makerRow2Space2 == white && makerRow2Space3 == white && makerRow2Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow3Space1;
		int breakerRow3Space2;
		int breakerRow3Space3;
		int breakerRow3Space4;
		
		breakerRow3Space1 = sc.nextInt();
		breakerRow3Space2 = sc.nextInt();
		breakerRow3Space3 = sc.nextInt();
		breakerRow3Space4 = sc.nextInt();

		int makerRow3Space1 = 0;
		int makerRow3Space2 = 0;
		int makerRow3Space3 = 0;
		int makerRow3Space4 = 0;
		
		if (breakerRow3Space1 > 6) {
			breakerRow3Space1 = 6;
		}

		if (breakerRow3Space1 < 1) {
			breakerRow3Space1 = 1;
		}

		if (breakerRow3Space2 > 6) {
			breakerRow3Space2 = 6;
		}

		if (breakerRow3Space2 < 1) {
			breakerRow3Space2 = 1;
		}

		if (breakerRow3Space3 > 6) {
			breakerRow3Space3 = 6;
		}

		if (breakerRow3Space3 < 1) {
			breakerRow3Space3 = 1;
		}

		if (breakerRow3Space4 > 6) {
			breakerRow3Space4 = 6;
		}

		if (breakerRow3Space4 < 1) {
			breakerRow3Space4 = 1;
		}
		
		System.out.println("" + breakerRow3Space1 + breakerRow3Space2 + breakerRow3Space3 + breakerRow3Space4);
		
		if (breakerRow3Space1 == makerCombinationAnswer1) {
			makerRow3Space1 = white;
		}
		
		else makerRow3Space1 = black;
		
		if (breakerRow3Space2 == makerCombinationAnswer2) {
			makerRow3Space2 = white;
		}
		
		else makerRow3Space2 = black;
		
		if (breakerRow3Space3 == makerCombinationAnswer2) {
			makerRow3Space3 = white;
		}
		
		else makerRow3Space3 = black;
		
		if (breakerRow3Space4 == makerCombinationAnswer4) {
			makerRow3Space4 = white;
		}
		
		else makerRow3Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow3Space1 + makerRow3Space2 + makerRow3Space3 + makerRow3Space4);
		
		
		if (makerRow3Space1 == white && makerRow3Space2 == white && makerRow3Space3 == white && makerRow3Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow4Space1;
		int breakerRow4Space2;
		int breakerRow4Space3;
		int breakerRow4Space4;
		
		breakerRow4Space1 = sc.nextInt();
		breakerRow4Space2 = sc.nextInt();
		breakerRow4Space3 = sc.nextInt();
		breakerRow4Space4 = sc.nextInt();

		int makerRow4Space1 = 0;
		int makerRow4Space2 = 0;
		int makerRow4Space3 = 0;
		int makerRow4Space4 = 0;
		
		if (breakerRow4Space1 > 6) {
			breakerRow4Space1 = 6;
		}

		if (breakerRow4Space1 < 1) {
			breakerRow4Space1 = 1;
		}

		if (breakerRow4Space2 > 6) {
			breakerRow4Space2 = 6;
		}

		if (breakerRow4Space2 < 1) {
			breakerRow4Space2 = 1;
		}

		if (breakerRow4Space3 > 6) {
			breakerRow4Space3 = 6;
		}

		if (breakerRow4Space3 < 1) {
			breakerRow4Space3 = 1;
		}

		if (breakerRow4Space4 > 6) {
			breakerRow4Space4 = 6;
		}

		if (breakerRow4Space4 < 1) {
			breakerRow4Space4 = 1;
		}
		
		System.out.println("" + breakerRow4Space1 + breakerRow4Space2 + breakerRow4Space3 + breakerRow4Space4);
		
		if (breakerRow4Space1 == makerCombinationAnswer1) {
			makerRow4Space1 = white;
		}
		
		else makerRow4Space1 = black;
		
		if (breakerRow4Space2 == makerCombinationAnswer2) {
			makerRow4Space2 = white;
		}
		
		else makerRow4Space2 = black;
		
		if (breakerRow4Space3 == makerCombinationAnswer2) {
			makerRow4Space3 = white;
		}
		
		else makerRow4Space3 = black;
		
		if (breakerRow4Space4 == makerCombinationAnswer4) {
			makerRow4Space4 = white;
		}
		
		else makerRow4Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow4Space1 + makerRow4Space2 + makerRow4Space3 + makerRow4Space4);
		
		
		if (makerRow4Space1 == white && makerRow4Space2 == white && makerRow4Space3 == white && makerRow4Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow5Space1;
		int breakerRow5Space2;
		int breakerRow5Space3;
		int breakerRow5Space4;
		
		breakerRow5Space1 = sc.nextInt();
		breakerRow5Space2 = sc.nextInt();
		breakerRow5Space3 = sc.nextInt();
		breakerRow5Space4 = sc.nextInt();

		int makerRow5Space1 = 0;
		int makerRow5Space2 = 0;
		int makerRow5Space3 = 0;
		int makerRow5Space4 = 0;
		
		if (breakerRow5Space1 > 6) {
			breakerRow5Space1 = 6;
		}

		if (breakerRow5Space1 < 1) {
			breakerRow5Space1 = 1;
		}

		if (breakerRow5Space2 > 6) {
			breakerRow5Space2 = 6;
		}

		if (breakerRow5Space2 < 1) {
			breakerRow5Space2 = 1;
		}

		if (breakerRow5Space3 > 6) {
			breakerRow5Space3 = 6;
		}

		if (breakerRow5Space3 < 1) {
			breakerRow5Space3 = 1;
		}

		if (breakerRow5Space4 > 6) {
			breakerRow5Space4 = 6;
		}

		if (breakerRow5Space4 < 1) {
			breakerRow5Space4 = 1;
		}
		
		System.out.println("" + breakerRow5Space1 + breakerRow5Space2 + breakerRow5Space3 + breakerRow5Space4);
		
		if (breakerRow5Space1 == makerCombinationAnswer1) {
			makerRow5Space1 = white;
		}
		
		else makerRow5Space1 = black;
		
		if (breakerRow5Space2 == makerCombinationAnswer2) {
			makerRow5Space2 = white;
		}
		
		else makerRow5Space2 = black;
		
		if (breakerRow5Space3 == makerCombinationAnswer2) {
			makerRow5Space3 = white;
		}
		
		else makerRow5Space3 = black;
		
		if (breakerRow5Space4 == makerCombinationAnswer4) {
			makerRow5Space4 = white;
		}
		
		else makerRow5Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow5Space1 + makerRow5Space2 + makerRow5Space3 + makerRow5Space4);
		
		
		if (makerRow5Space1 == white && makerRow5Space2 == white && makerRow5Space3 == white && makerRow5Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow6Space1;
		int breakerRow6Space2;
		int breakerRow6Space3;
		int breakerRow6Space4;
		
		breakerRow6Space1 = sc.nextInt();
		breakerRow6Space2 = sc.nextInt();
		breakerRow6Space3 = sc.nextInt();
		breakerRow6Space4 = sc.nextInt();

		int makerRow6Space1 = 0;
		int makerRow6Space2 = 0;
		int makerRow6Space3 = 0;
		int makerRow6Space4 = 0;
		
		if (breakerRow6Space1 > 6) {
			breakerRow6Space1 = 6;
		}

		if (breakerRow6Space1 < 1) {
			breakerRow6Space1 = 1;
		}

		if (breakerRow6Space2 > 6) {
			breakerRow6Space2 = 6;
		}

		if (breakerRow6Space2 < 1) {
			breakerRow6Space2 = 1;
		}

		if (breakerRow6Space3 > 6) {
			breakerRow6Space3 = 6;
		}

		if (breakerRow6Space3 < 1) {
			breakerRow6Space3 = 1;
		}

		if (breakerRow6Space4 > 6) {
			breakerRow6Space4 = 6;
		}

		if (breakerRow6Space4 < 1) {
			breakerRow6Space4 = 1;
		}
		
		System.out.println("" + breakerRow6Space1 + breakerRow6Space2 + breakerRow6Space3 + breakerRow6Space4);
		
		if (breakerRow6Space1 == makerCombinationAnswer1) {
			makerRow6Space1 = white;
		}
		
		else makerRow6Space1 = black;
		
		if (breakerRow6Space2 == makerCombinationAnswer2) {
			makerRow6Space2 = white;
		}
		
		else makerRow6Space2 = black;
		
		if (breakerRow6Space3 == makerCombinationAnswer2) {
			makerRow6Space3 = white;
		}
		
		else makerRow6Space3 = black;
		
		if (breakerRow6Space4 == makerCombinationAnswer4) {
			makerRow6Space4 = white;
		}
		
		else makerRow6Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow6Space1 + makerRow6Space2 + makerRow6Space3 + makerRow6Space4);
		
		
		if (makerRow6Space1 == white && makerRow6Space2 == white && makerRow6Space3 == white && makerRow6Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow7Space1;
		int breakerRow7Space2;
		int breakerRow7Space3;
		int breakerRow7Space4;
		
		breakerRow7Space1 = sc.nextInt();
		breakerRow7Space2 = sc.nextInt();
		breakerRow7Space3 = sc.nextInt();
		breakerRow7Space4 = sc.nextInt();

		int makerRow7Space1 = 0;
		int makerRow7Space2 = 0;
		int makerRow7Space3 = 0;
		int makerRow7Space4 = 0;
		
		if (breakerRow7Space1 > 6) {
			breakerRow7Space1 = 6;
		}

		if (breakerRow7Space1 < 1) {
			breakerRow7Space1 = 1;
		}

		if (breakerRow7Space2 > 6) {
			breakerRow7Space2 = 6;
		}

		if (breakerRow7Space2 < 1) {
			breakerRow7Space2 = 1;
		}

		if (breakerRow7Space3 > 6) {
			breakerRow7Space3 = 6;
		}

		if (breakerRow7Space3 < 1) {
			breakerRow7Space3 = 1;
		}

		if (breakerRow7Space4 > 6) {
			breakerRow7Space4 = 6;
		}

		if (breakerRow7Space4 < 1) {
			breakerRow7Space4 = 1;
		}
		
		System.out.println("" + breakerRow7Space1 + breakerRow7Space2 + breakerRow7Space3 + breakerRow7Space4);
		
		if (breakerRow7Space1 == makerCombinationAnswer1) {
			makerRow7Space1 = white;
		}
		
		else makerRow7Space1 = black;
		
		if (breakerRow7Space2 == makerCombinationAnswer2) {
			makerRow7Space2 = white;
		}
		
		else makerRow7Space2 = black;
		
		if (breakerRow7Space3 == makerCombinationAnswer2) {
			makerRow7Space3 = white;
		}
		
		else makerRow7Space3 = black;
		
		if (breakerRow7Space4 == makerCombinationAnswer4) {
			makerRow7Space4 = white;
		}
		
		else makerRow7Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow7Space1 + makerRow7Space2 + makerRow7Space3 + makerRow7Space4);
		
		
		if (makerRow7Space1 == white && makerRow7Space2 == white && makerRow7Space3 == white && makerRow7Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow8Space1;
		int breakerRow8Space2;
		int breakerRow8Space3;
		int breakerRow8Space4;
		
		breakerRow8Space1 = sc.nextInt();
		breakerRow8Space2 = sc.nextInt();
		breakerRow8Space3 = sc.nextInt();
		breakerRow8Space4 = sc.nextInt();

		int makerRow8Space1 = 0;
		int makerRow8Space2 = 0;
		int makerRow8Space3 = 0;
		int makerRow8Space4 = 0;
		
		if (breakerRow8Space1 > 6) {
			breakerRow8Space1 = 6;
		}

		if (breakerRow8Space1 < 1) {
			breakerRow8Space1 = 1;
		}

		if (breakerRow8Space2 > 6) {
			breakerRow8Space2 = 6;
		}

		if (breakerRow8Space2 < 1) {
			breakerRow8Space2 = 1;
		}

		if (breakerRow8Space3 > 6) {
			breakerRow8Space3 = 6;
		}

		if (breakerRow8Space3 < 1) {
			breakerRow8Space3 = 1;
		}

		if (breakerRow8Space4 > 6) {
			breakerRow8Space4 = 6;
		}

		if (breakerRow1Space4 < 1) {
			breakerRow1Space4 = 1;
		}
		
		System.out.println("" + breakerRow8Space1 + breakerRow8Space2 + breakerRow8Space3 + breakerRow8Space4);
		
		if (breakerRow8Space1 == makerCombinationAnswer1) {
			makerRow8Space1 = white;
		}
		
		else makerRow8Space1 = black;
		
		if (breakerRow8Space2 == makerCombinationAnswer2) {
			makerRow8Space2 = white;
		}
		
		else makerRow8Space2 = black;
		
		if (breakerRow8Space3 == makerCombinationAnswer2) {
			makerRow8Space3 = white;
		}
		
		else makerRow8Space3 = black;
		
		if (breakerRow8Space4 == makerCombinationAnswer4) {
			makerRow8Space4 = white;
		}
		
		else makerRow8Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow8Space1 + makerRow8Space2 + makerRow8Space3 + makerRow8Space4);
		
		
		if (makerRow8Space1 == white && makerRow8Space2 == white && makerRow8Space3 == white && makerRow8Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow9Space1;
		int breakerRow9Space2;
		int breakerRow9Space3;
		int breakerRow9Space4;
		
		breakerRow9Space1 = sc.nextInt();
		breakerRow9Space2 = sc.nextInt();
		breakerRow9Space3 = sc.nextInt();
		breakerRow9Space4 = sc.nextInt();

		int makerRow9Space1 = 0;
		int makerRow9Space2 = 0;
		int makerRow9Space3 = 0;
		int makerRow9Space4 = 0;
		
		if (breakerRow9Space1 > 6) {
			breakerRow9Space1 = 6;
		}

		if (breakerRow9Space1 < 1) {
			breakerRow9Space1 = 1;
		}

		if (breakerRow9Space2 > 6) {
			breakerRow9Space2 = 6;
		}

		if (breakerRow9Space2 < 1) {
			breakerRow9Space2 = 1;
		}

		if (breakerRow9Space3 > 6) {
			breakerRow9Space3 = 6;
		}

		if (breakerRow9Space3 < 1) {
			breakerRow9Space3 = 1;
		}

		if (breakerRow9Space4 > 6) {
			breakerRow9Space4 = 6;
		}

		if (breakerRow9Space4 < 1) {
			breakerRow9Space4 = 1;
		}
		
		System.out.println("" + breakerRow9Space1 + breakerRow9Space2 + breakerRow9Space3 + breakerRow9Space4);
		
		
		if (breakerRow9Space1 == makerCombinationAnswer1) {
			makerRow9Space1 = white;
		}
		
		else makerRow9Space1 = black;
		
		if (breakerRow9Space2 == makerCombinationAnswer2) {
			makerRow9Space2 = white;
		}
		
		else makerRow9Space2 = black;
		
		if (breakerRow9Space3 == makerCombinationAnswer2) {
			makerRow9Space3 = white;
		}
		
		else makerRow9Space3 = black;
		
		if (breakerRow9Space4 == makerCombinationAnswer4) {
			makerRow9Space4 = white;
		}
		
		else makerRow9Space4 = black;
		
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow9Space1 + makerRow9Space2 + makerRow9Space3 + makerRow9Space4);
		
		
		if (makerRow9Space1 == white && makerRow9Space2 == white && makerRow9Space3 == white && makerRow9Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Next Round");
		
		System.out.println(" ");
		System.out.println("8 is white and 7 is black");
		System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		System.out.println("" + makerRow9Space1 + makerRow9Space2 + makerRow9Space3 + makerRow9Space4);
		System.out.println("Breaker's turn");
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");
		
		int breakerRow10Space1;
		int breakerRow10Space2;
		int breakerRow10Space3;
		int breakerRow10Space4;
		
		breakerRow10Space1 = sc.nextInt();
		breakerRow10Space2 = sc.nextInt();
		breakerRow10Space3 = sc.nextInt();
		breakerRow10Space4 = sc.nextInt();

		int makerRow10Space1 = 0;
		int makerRow10Space2 = 0;
		int makerRow10Space3 = 0;
		int makerRow10Space4 = 0;
		
		if (breakerRow10Space1 > 6) {
			breakerRow10Space1 = 6;
		}

		if (breakerRow10Space1 < 1) {
			breakerRow10Space1 = 1;
		}

		if (breakerRow10Space2 > 6) {
			breakerRow10Space2 = 6;
		}

		if (breakerRow10Space2 < 1) {
			breakerRow10Space2 = 1;
		}

		if (breakerRow10Space3 > 6) {
			breakerRow10Space3 = 6;
		}

		if (breakerRow10Space3 < 1) {
			breakerRow10Space3 = 1;
		}

		if (breakerRow10Space4 > 6) {
			breakerRow10Space4 = 6;
		}

		if (breakerRow10Space4 < 1) {
			breakerRow10Space4 = 1;
		}
		
		if (breakerRow10Space1 == makerCombinationAnswer1) {
			makerRow10Space1 = white;
		}
		
		else makerRow10Space1 = black;
		
		if (breakerRow10Space2 == makerCombinationAnswer2) {
			makerRow10Space2 = white;
		}
		
		else makerRow10Space2 = black;
		
		if (breakerRow10Space3 == makerCombinationAnswer2) {
			makerRow10Space3 = white;
		}
		
		else makerRow10Space3 = black;
		
		if (breakerRow10Space4 == makerCombinationAnswer4) {
			makerRow10Space4 = white;
		}
		
		else makerRow10Space4 = black;
		
		
		if (makerRow10Space1 == white && makerRow10Space2 == white && makerRow10Space3 == white && makerRow10Space4 == white) {
			System.out.println("Breaker wins.");
		}
		
		else System.out.println("Wrong");
			System.out.println("Out of turns, Maker wins.");
			System.out.println("Combination is " + makerCombinationAnswer1 + makerCombinationAnswer2 + makerCombinationAnswer3 + makerCombinationAnswer4);

	}

}
