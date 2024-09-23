/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;


public class AgeValidity {

    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);
    boolean drivingUnderage = false;
    int age = sc.nextInt();
    
    if (age <= 18) {
      drivingUnderage = true;
	}
    
    else drivingUnderage = false;
    
    System.out.println(drivingUnderage);
    
    
    
    

       
    }
}
