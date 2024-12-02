package exercises;

import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
    	  Scanner input = new Scanner(System.in);
    	  
    	  System.out.println("Voer een maand in als nummer");
    	  
    	  int maand = input.nextInt();

    	  switch (maand) {
    	  case 1:
    		  System.out.println("Januari");
    	      break;
    	  case 2: 
    		  System.out.println("Februari");
              break;
    	  case 3:
    		  System.out.println("Maart");
    		  break;
    	  case 4: 
    		  System.out.println("April");
    		  break;
    	  case 5:
    		  System.out.println("Mei");
    		  break;
    	  case 6: 
    		  System.out.println("Juni");
    		  break;
    	  case 7:
    		  System.out.println("Juli");
    		  break;
    	  case 8: 
    		  System.out.println("Augustus");
    		  break;
    	  case 9:
    		  System.out.println("September");
    		  break;
    	  case 10: 
    		  System.out.println("Oktober");
    		  break;
    	  case 11:
    		  System.out.println("November");
    		  break;
    	  case 12: 
    		  System.out.println("December");
    		  break;
    	  default:
    		  System.out.println("Deze maand bestaat niet");

    	  }
    }
}
