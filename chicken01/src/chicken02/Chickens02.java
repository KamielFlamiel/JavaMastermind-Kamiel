package chicken02;
public class Chickens02 {
	
    public static void main(String[] args) {
        
    	int firstDay = 100;
    	int secondDay = 121;
    	int thirdDay = 117;

    	double dailyAverage = firstDay + secondDay + thirdDay;
    	dailyAverage /=3.0;
    	
    	double monthlyAverage = dailyAverage * 30;
    	
    	double monthlyProfit = monthlyAverage * 0.18;
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
     
}
