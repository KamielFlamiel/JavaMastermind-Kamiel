package exercises;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayopdracht {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> superHeroes = new ArrayList<String>();
		
		superHeroes.add("Superman");
		superHeroes.add("Spiderman");
		superHeroes.add("Batman");
		superHeroes.add("Thor");
		superHeroes.add("Hulk");

		System.out.println(superHeroes);
		
		System.out.println("Do you want to remove or add superheroes?");
		System.out.println("Press 1 to add and press 2 to remove.");
		System.out.println("Press 3 to view the list");
		
		int userInput = input.nextInt();
	    int	userInputLoop;
	    String superHero;
	    
	do {
		
		switch (userInput) {
	    case 1: 
	    	System.out.println("Name a superhero to add to the list");
	    	superHero = input.next();
	        superHeroes.add(superHero);
	    	break;
	    case 2:
	    	System.out.println("Name a superhero to remove from the list");
	    	superHero = input.next();
	        superHeroes.add(superHero);
	    	break;
	    case 3:
	    	System.out.println(superHeroes);
	    	
	}
	
	Collections.sort(superHeroes);
	
	System.out.println("press 4 if you wish to continue");
	
	userInputLoop = input.nextInt();
		
	} while (userInputLoop != 4);
	
	System.out.println("Kies een missie");
	
	
		
		
		
		
		
	}

}
