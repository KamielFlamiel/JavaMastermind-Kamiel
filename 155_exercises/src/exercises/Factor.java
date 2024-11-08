package exercises;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int getal = input.nextInt();
		
	    for (int getal2 = 1; getal2 <= getal; getal2++) {
	    	
	    	getal /= getal2;
	    	System.out.println(getal);
	    	
	    	
	    }
		

	}

}
