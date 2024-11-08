package exercises;

import java.util.HashSet;
import java.util.Scanner;

public class Java_exercises_10 extends Exercise4_155 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// EXERCISE 32 zelf gedaan
//		int eersteGetal = input.nextInt();
//		int tweedeGetal = input.nextInt();
//		
//		if (eersteGetal != tweedeGetal) {
//			System.out.println(eersteGetal + " != " + tweedeGetal);
//			
//		}
//		
//		if (eersteGetal < tweedeGetal) {
//			System.out.println(eersteGetal + " < " + tweedeGetal);
//			
//		}
//		
//		if (eersteGetal <= tweedeGetal) {
//			System.out.println(eersteGetal + " <= " + tweedeGetal);
//		}	
		
		// EXERCISE 33 chatgpt
		
//		int number = input.nextInt();
//
//        int sum = 0;
//        while (number != 0) {
//            sum += number % 10; 
//            number /= 10;       
//        }
//
//        System.out.println("The sum of the digits is: " + sum);
		
		// EXERCISE 36 chatgpt
		
//		System.out.print("Input the latitude of coordinate 1: ");
//        double latitude1 = Math.toRadians(input.nextDouble());
//        System.out.print("Input the longitude of coordinate 1: ");
//        double longitude1 = Math.toRadians(input.nextDouble());
//
//        System.out.print("Input the latitude of coordinate 2: ");
//        double latitude2 = Math.toRadians(input.nextDouble());
//        System.out.print("Input the longitude of coordinate 2: ");
//        double longitude2 = Math.toRadians(input.nextDouble());
//
//        final double RADIUS = 6371.01;
//
//        double distance = RADIUS * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
//                         Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
//
//        System.out.println("The distance between those points is: " + distance + " km");
		
		//EXERCISE 37 chatgpt
		
//        System.out.print("Input a string: ");
//        String in = input.nextLine();
//
//        String reversed = new StringBuilder(in).reverse().toString();
//
//        System.out.println("Reverse string: " + reversed);
		
		//EXERCISE 38 chargpt
		
//        System.out.print("The string is: ");
//        String in = input.nextLine();
//
//        int letterCount = 0;
//        int spaceCount = 0;
//        int numberCount = 0;
//        int otherCount = 0;
//
//        for (char ch : in.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                letterCount++;
//            } else if (Character.isWhitespace(ch)) {
//                spaceCount++;
//            } else if (Character.isDigit(ch)) {
//                numberCount++;
//            } else {
//                otherCount++;
//            }
//        }
//
//        System.out.println("letter: " + letterCount);
//        System.out.println("space: " + spaceCount);
//        System.out.println("number: " + numberCount);
//        System.out.println("other: " + otherCount);
		
        // EXERCISE 39 chatgpt
//        
//        HashSet<String> uniqueNumbers = new HashSet<>();
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                for (int k = 1; k <= 4; k++) {
//                    if (i != j && j != k && i != k) {
//                        String number = "" + i + j + k;
//                        uniqueNumbers.add(number);
//                    }
//                }
//            }
//        }
//
//        for (String number : uniqueNumbers) {
//            System.out.println(number);
//        }
//
//        System.out.println("Total number of the three-digit-number is " + uniqueNumbers.size());
//    
		
		//EXERCISE 42 zelf gedaan
		
//		System.out.println("Input your password");
//		
//		String password = input.next();
//		
//		System.out.println("Your password is : " + password);
		
		//Exercise 43 chatgpt
		
//		System.out.println("Twinkle, twinkle, little star, \r\n" 
//				+ "How I wonder what you are!  \r\n"
//				+ "Up above the world so high,      \r\n"
//				+ "Like a diamond in the sky.  \r\n"
//				+ "Twinkle, twinkle, little star,  \r\n"
//				+ "How I wonder what you are");
		
		//EXERCISE 50 chatgpt
		
//		System.out.println("Divided by 3:"); 
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + ", ");
//            }
//        }
//        
//        System.out.println("\nDivided by 5:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + ", ");
//            }
//        }
//        
//        System.out.println("\nDivided by 3 & 5:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print(i + ", ");
//            }
//        }
		
		//Exercise 69 chatgpt
		
//		System.out.print("Enter a string of even length: ");
//        String in = input.nextLine();
//
//        // Check if the string length is even
//        if (in.length() % 2 == 0) {
//            // Calculate the midpoint
//            int mid = in.length() / 2;
//            // Extract the first half
//            String firstHalf = in.substring(0, mid);
//            // Print the result
//            System.out.println("First half: " + firstHalf);
//        } else {
//            System.out.println("The string length is not even.");
//        }
		
	}

}
