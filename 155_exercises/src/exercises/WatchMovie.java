/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the movie ticket price \n");
        
        int moviePrice = input.nextInt();
        int movieRating = input.nextInt();
        
        if (moviePrice >= 12 && movieRating == 5) {
        	System.out.println("I'm interested in watching the movie");
        	
        } else {
            System.out.println("I'm not interested in watching the movie");
        }
        

        
   
        
        
        

    }
}
