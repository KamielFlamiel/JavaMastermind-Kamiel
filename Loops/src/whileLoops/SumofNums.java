/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileLoops;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
//        int sum = 0;
//        int round = 0;
//        System.out.print("Enter a number, you only have 10 inputs: ");
//        int number = console.nextInt();
//
//        while (round <= 9) {
//            sum = sum + number;
//            System.out.print("Enter a number: ");
//            number = console.nextInt();
//            round ++;
//        }
//
//        System.out.println("The sum is " + sum);
        
        int sum = 0;
        System.out.print("Enter a number, you only have 10 inputs: ");
        
        for (int round = 0; round <= 9; round++) {
        	System.out.print("Enter a number: ");  
        	int number = console.nextInt();
        	sum = sum + number;
		}

        System.out.println("The sum is " + sum);
        
//        int sum = 0;
//        int round = 0;
//        System.out.print("Enter a number, you only have 10 inputs: ");
//       
//        do {
//        	int number = console.nextInt();
//        	round ++;
//        	sum = sum + number;
//		} while (round <=9);
//        
//        System.out.println("The sum is " + sum);
        
    }
}
