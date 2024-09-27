
package ifElseEx;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = in.nextInt();
        int sum = num % 2;
        
        if (sum == 1) {
    	   System.out.println("Het getal is oneven");
        }
        if (sum == 0) {
           System.out.println("Het getal is even");
        }
	
    }
}

