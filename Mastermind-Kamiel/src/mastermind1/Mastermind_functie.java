package mastermind1;

import java.util.Random;
import java.util.Scanner;

public class Mastermind_functie {
	private Scanner input = new Scanner(System.in);
	private Random rand = new Random();
	public int[] breakerSpaces = new int[4];
	public int[] makerCombinationAnswer = new int[4];
	public int[] checkSpaces = { -1, -1, -1, -1 };
	
	int black = 7;
	int white = 8;
	int empty = 0;
	
	public int[] randomcode()
	{
		for (int i = 0; i < makerCombinationAnswer.length; i++) {
			int in = rand.nextInt(6) + 1;
			makerCombinationAnswer[i] = in;
		}
		return makerCombinationAnswer;
	}
	
	public int[] inputcode()
	{
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
		return breakerSpaces;
	}
	
	public int[] checkcode()
	{
		int[] checkSpaces = { -1, -1, -1, -1 };
		int randomnum = rand.nextInt(4);
		int check = breakerSpaces[randomnum];
		int verify;
		
		for (int i = 0; i < checkSpaces.length; i++) {
			verify = breakerSpaces[i];
			randomnum = rand.nextInt(4);
			check = breakerSpaces[randomnum];

			checkSpaces[i] = black;

			if (verify == makerCombinationAnswer[i]) {
				checkSpaces[i] = white;
				
			} else if (verify == makerCombinationAnswer[0] || verify == makerCombinationAnswer[1] || verify == makerCombinationAnswer[2] || verify == makerCombinationAnswer[3]) {
					checkSpaces[i] = black;
					
				} else { 
					checkSpaces[i] = empty;
						
				}
		}
		return checkSpaces;
	}
	
	public boolean victorycheck(int[] checkSpaces)
	{
			if (checkSpaces[0] == white && checkSpaces[1] == white && checkSpaces[2] == white
					&& checkSpaces[3] == white) {
				System.out.println("Breaker wins.");
			
				return true;
			}
		
		return false;
		
	}
}
