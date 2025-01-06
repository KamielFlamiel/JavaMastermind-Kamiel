package exercises;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        double totalTable = calc.findTotal(10, "Kees");
        totalTable += calc.findTotal(12, "Uphie");
        totalTable += calc.findTotal(9,  "Piamat");
        totalTable += calc.findTotal(8,  "Henry");
        totalTable += calc.findTotal(7,  "Sigma");
        totalTable += calc.findTotal(15, "Alex");
        totalTable += calc.findTotal(11, "Walter");
        totalTable += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       
       
       System.out.println(totalTable);
       
       
       
       
    } 
}
