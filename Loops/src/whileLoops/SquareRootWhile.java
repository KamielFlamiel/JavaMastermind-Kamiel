
package whileLoops;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
    int total = 0;
	int number = console.nextInt();
	while (number >= 0) {
		number = console.nextInt();
		total += number;
	}
	
	System.out.println(total);
	
	

	
    
}
    
}
