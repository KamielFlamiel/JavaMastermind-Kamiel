package exercises;

import java.util.ArrayList;

public class Tip01 {
    public static void main(String[] args) {
      
//    	ArrayList<Double> personen = new ArrayList<Double>();
//    	
//    	personen.add(10.0);
//    	personen.add(12.0);
//    	personen.add(9.0);
//    	personen.add(8.0);
//    	personen.add(7.0);
//    	personen.add(15.0);
//    	personen.add(11.0);
//    	personen.add(30.0); 
    	
    	Calculator calc = new Calculator();
    	
    	calc.originalPrice = 10;
    	calc.findTotal();
    	
    	calc.originalPrice = 12;
    	calc.findTotal();
    	 
    }    
}
