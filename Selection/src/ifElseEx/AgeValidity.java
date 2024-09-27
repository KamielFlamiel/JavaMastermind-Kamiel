
package ifElseEx;

import java.util.Scanner;


public class AgeValidity {

    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);
   
    boolean drivingUnderage;
    int age = sc.nextInt();
    
    if (age <= 18) {
      drivingUnderage = true;
	}
    
    else drivingUnderage = false;
    
    System.out.println(drivingUnderage);
    
    }
}
