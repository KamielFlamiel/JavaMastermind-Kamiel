package mastermind1;

import java.util.Iterator;
import java.util.Scanner;

public class Mastermind_test extends Flowchart_mastermind {
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		
		    int black = 7;
	        int white = 8;
	 
	        System.out.println("Maker, Create combination.");
	        System.out.println("Red = 1");
	        System.out.println("Blue = 2");
	        System.out.println("Yellow = 3");
	        System.out.println("Purple = 4");
	        System.out.println("Green = 5");
	        System.out.println("Orange = 6");
	        int[] makerCombinationAnswer = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
	        for (int i = 0; i < makerCombinationAnswer.length; i++) {
	        	
	        	makerCombinationAnswer[i] = input.nextInt();
				
			}
	        int verify;

	}

}
