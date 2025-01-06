package exercises;

import java.util.ArrayList;

public class CalculatorTest2 {
    public static void main(String[] args) { 
  	
    	ArrayList<Double> personen = new ArrayList<Double>();
    	
    	personen.add(10.0);
    	personen.add(12.0);
    	personen.add(9.0);
   	    personen.add(8.0);
    	personen.add(7.0);
   	    personen.add(15.0);
    	personen.add(11.0);
 	    personen.add(30.0); 
 	    
 	   Calculator2 calc = new Calculator2();
 	    
 	    double total = calc.tax + calc.tip;
 	    
 	    for (int i = 0; i < personen.size(); i++) {
 	        personen.set(i, total * (total / 100));
 	    }
    	
    	calc.getCost(0);
    	
    	System.out.println(personen);
    	
    	
        
    	
    }
}
