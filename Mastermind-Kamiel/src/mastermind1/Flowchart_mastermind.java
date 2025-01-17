package mastermind1;

public class Flowchart_mastermind {

	public static void main(String[] args) {

		Mastermind_functie function = new Mastermind_functie();
		
		int[] makerCombinationAnswer = function.randomcode();
		int round = 0; 
		int roundOpposite = 10;
		
		System.out.println("" + makerCombinationAnswer[0] + makerCombinationAnswer[1] + makerCombinationAnswer[2] + makerCombinationAnswer[3]);
		System.out.println("");
		System.out.println("The maker has made a combination");
		System.out.println("Red = 1. " + "Blue = 2. " + "Yellow = 3. " + "Purple = 4. " + "Green = 5. " + "Orange = 6. ");
		System.out.println("Place a colour you want by pressing the number");
		System.out.println("Try to guess the Maker's combination");

		do {
			// Deze do while moet nog een for loop worden

			int[] breakerSpaces = function.inputcode();
			
			System.out.println("" + breakerSpaces[0] + breakerSpaces[1] + breakerSpaces[2] + breakerSpaces[3]);

			int[] checkSpaces = function.checkcode();
			
			System.out.println("8 is white and 7 is black");
			System.out.println("if a space is white then you guessed right, if it's black then it's right but in the wrong position and if it's empty, then you guessed wrong");
			System.out.println("" + checkSpaces[0] + checkSpaces[1] + checkSpaces[2] + checkSpaces[3]);

			function.victorycheck(checkSpaces);

			round++;
			roundOpposite--;
			
			System.out.println("Round " + round);
			System.out.println("You have " + roundOpposite + " tries left");
		    
		} while (round < 10);
		
		System.out.println("Out of turns, Maker wins");

	}

}