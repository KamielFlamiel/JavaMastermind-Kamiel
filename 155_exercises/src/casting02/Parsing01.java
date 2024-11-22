package casting02;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "sigma123";
        
       int totalTax = Integer.parseInt(shirtPrice);
       double totalTax1 =  Double.parseDouble(taxRate);
       int sigma = Integer.parseInt(gibberish);
        
        double totalTax3 = totalTax * totalTax1;
        
        System.out.println(totalTax);
        
        System.out.println(sigma);
        
       
    }
    
}
