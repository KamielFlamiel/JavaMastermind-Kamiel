package exercises;
import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String args[]) {
    	ArrayList<Integer> Cijfers = new ArrayList<Integer>();
    	Cijfers.add(1);
    	Cijfers.add(2);
    	Cijfers.add(3);
    	Cijfers.add(4);
    	
    	
    	for (int i = 0; i < Cijfers.size(); i++) {
    		System.out.println(Cijfers);
    	}
    	
    	
    	
    	for (int Cijfer : Cijfers) {
    		if (Cijfer % 2 == 0) {
				Cijfers.remove(Integer.valueOf(Cijfer));
			} 
    		
    		System.out.println(Cijfer);
    		
    	}
    	
        
        
        
        
        
         
    }
}
