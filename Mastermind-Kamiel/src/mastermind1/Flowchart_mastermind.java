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
				} if (in < 1) {
					in = 1;
				}
				makerCombinationAnswer[i] = in;
			}
			System.out.println("" + makerCombinationAnswer[0] + makerCombinationAnswer[1] + makerCombinationAnswer[2] + makerCombinationAnswer[3]);
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
		System.out.println("Red = 1. "
				+ "Blue = 2. "
				+ "Yellow = 3. "
				+ "Purple = 4. "
				+ "Green = 5. "
				+ "Orange = 6. ");

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
			verify = breakerSpaces[0];
			
			// hier
			if (verify == makerCombinationAnswer[0]){
				breakerSpaces[0] = white;
			
			}
			else breakerSpaces[0] = black;
		
			verify = breakerSpaces[1];
			if (verify == makerCombinationAnswer[1]){
				breakerSpaces[1] = white;
			
			}
			else breakerSpaces[1] = black;
			
			verify = breakerSpaces[2];
			if (verify == makerCombinationAnswer[2]){
				breakerSpaces[2] = white;
			
			}
			else breakerSpaces[2] = black;
			
			verify = breakerSpaces[3];
			if (verify == makerCombinationAnswer[3]){
				breakerSpaces[3] = white;
			
			}
			else breakerSpaces[3] = black;
			// tot hier
			System.out.println("8 is white and 7 is black");
			System.out.println("if a space is white then you guessed right, if it's black then it's wrong.");
		    System.out.println("" + breakerSpaces[0] + breakerSpaces[1] + breakerSpaces[2] + breakerSpaces[3]);
		    
		    if (breakerSpaces[0] == white && breakerSpaces[1] == white && breakerSpaces[2] == white && breakerSpaces[3] == white) {
				System.out.println("Breaker wins.");
			}
			
			else round ++;
		    roundOpposite --;
		    System.out.println("Round " + round);
		    System.out.println("You have " + roundOpposite + " tries left");
		    
		} while (round < 10);
		    
		    
		    
		
		

	}

}

//        System.out.println(makerCombinationAnswer1 + makerCombinationAnswer2 + makerCombinationAnswer3 + makerCombinationAnswer4);
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        int nextround;
//        int round;
//
//        round = 0;
//        do {
//            System.out.println("Breaker's turn");
//            System.out.println("Red = 1");
//            System.out.println("Blue = 2");
//            System.out.println("Yellow = 3");
//            System.out.println("Purple = 4");
//            System.out.println("Green = 5");
//            System.out.println("Orange = 6");
//            System.out.println("Place a colour you want by pressing the number");
//            System.out.println("Try to guess the Maker's combination");
//            int breakerRow1Space1;
//            int breakerRow1Space2;
//            int breakerRow1Space3;
//            int breakerRow1Space4;
//
//            breakerRow1Space1 = input.nextInt();
//            breakerRow1Space2 = input.nextInt();
//            breakerRow1Space3 = input.nextInt();
//            breakerRow1Space4 = input.nextInt();
//            int makerRow1Space1;
//            int makerRow1Space2;
//            int makerRow1Space3;
//            int makerRow1Space4;
//
//            if (breakerRow1Space1 >= 6) {
//                breakerRow1Space1 = 6;
//                System.out.println(breakerRow1Space1);
//            } else {
//                if (breakerRow1Space1 <= 1) {
//                    breakerRow1Space1 = 1;
//                }
//                System.out.println(breakerRow1Space1);
//            }
//            if (breakerRow1Space2 >= 6) {
//                breakerRow1Space2 = 6;
//                System.out.println(breakerRow1Space2);
//            } else {
//                if (breakerRow1Space2 <= 1) {
//                    breakerRow1Space2 = 1;
//                }
//                System.out.println(breakerRow1Space2);
//            }
//            if (breakerRow1Space3 >= 6) {
//                breakerRow1Space3 = 6;
//                System.out.println(breakerRow1Space3);
//            } else {
//                if (breakerRow1Space3 <= 1) {
//                    breakerRow1Space3 = 1;
//                }
//                System.out.println(breakerRow1Space3);
//            }
//            if (breakerRow1Space4 >= 6) {
//                breakerRow1Space4 = 6;
//                System.out.println(breakerRow1Space4);
//            } else {
//                if (breakerRow1Space4 <= 1) {
//                    breakerRow1Space4 = 1;
//                }
//                System.out.println(breakerRow1Space4);
//            }
//            if (breakerRow1Space1 == makerCombinationAnswer1) {
//                makerRow1Space1 = white;
//            } else {
//                makerRow1Space1 = black;
//            }
//            if (breakerRow1Space2 == makerCombinationAnswer2) {
//                makerRow1Space2 = white;
//            } else {
//                makerRow1Space2 = black;
//            }
//            if (breakerRow1Space3 == makerCombinationAnswer3) {
//                makerRow1Space3 = white;
//            } else {
//                makerRow1Space3 = black;
//            }
//            if (breakerRow1Space4 == makerCombinationAnswer4) {
//                makerRow1Space4 = white;
//            } else {
//                makerRow1Space4 = black;
//            }
//            System.out.println("8 is white and 7 is black");
//            System.out.println("if a space is white then you guessed right, if it's black then you guessed wrong");
//            System.out.println(makerRow1Space1 + makerRow1Space2 + makerRow1Space3 + makerRow1Space4);
//            if (makerRow1Space1 == white && makerRow1Space2 == white && makerRow1Space3 == white && makerRow1Space4 == white) {
//                System.out.println("Breaker wins");
//                nextround = 0;
//            } else {
//                System.out.println("Next round");
//                nextround = 1;
//            }
//            round = round + 1;
//        } while (nextround == 1 && round <= 10);
//        System.out.println("Out of turns, Maker wins");
