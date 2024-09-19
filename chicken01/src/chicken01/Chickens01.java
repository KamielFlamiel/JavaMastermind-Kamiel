
package chicken01;

public class Chickens01 {
    public static void main(String[] args) {
        //situatie 1
    	
    	int eggsPerChicken = 5;
    	int chickenCount = 3;
    	
    	
    	
    	int totalEggs = 0;
    	
    	totalEggs += eggsPerChicken * chickenCount;
    	
    	chickenCount++;
    	
    	totalEggs += eggsPerChicken * chickenCount;
    	
    	chickenCount /=2;
    	
    	totalEggs += eggsPerChicken * chickenCount;
    	
    	System.out.println(totalEggs);
    	
    	//situatie 2
    	
    	int eggsPerChicken1 = 5;
    	int chickenCount1 = 8;
    	
    	
    	int totalEggs1 = 0;
    	
    	totalEggs1 += eggsPerChicken1 * chickenCount1;
    	
    	chickenCount1++;
    	totalEggs1 += eggsPerChicken1 * chickenCount1;
    	
    	chickenCount1 /=2;
    	totalEggs1 += eggsPerChicken1 * chickenCount1;
    	
    	System.out.println(totalEggs1);
        
    	
    }   
}
