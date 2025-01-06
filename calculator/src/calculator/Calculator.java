package calculator;
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
    	int result = 0;
    	try {
    		result = x / y;
    	}
    	catch (ArithmeticException ex) 
    	{
    		System.out.println(ex.getMessage());
    	}
        return result;
    }
}
