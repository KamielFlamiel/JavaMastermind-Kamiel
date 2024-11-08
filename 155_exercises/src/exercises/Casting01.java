
package exercises;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint 
    	
    	byte byte1 = (byte) 128;
    	//hij weet niet welke casting hij moet nemen
    	
    	short short1 = (short) 128;
    	
    	short1 = (byte) 128;
    	System.out.println(short1);
    	
    	byte byte2 = (byte) 127;
    	byte2++;
    	
    	System.out.println(byte2);

    	byte2++;
    	
    	System.out.println(byte2);
        
    }    
}
