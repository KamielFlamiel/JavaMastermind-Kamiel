package arreyEx;
public class ArrayEx1 {

    public static void main(String args[]) {
        
        long[] primeNum = new long[20];
        int[] even = new int[5];
        
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        
        long[] primes2 = primes;
        primes2[0] = 5;
        //System.out.println(primes2[0]);
        //System.out.println(primes[0]);
        
        int[] score = new int[9];
        byte[] values = new byte[10];
        
        for (byte i = 0; i < values.length; i++) {
			values[i] = 1;
			System.out.println("" + values[i]);
		}

    }

}
