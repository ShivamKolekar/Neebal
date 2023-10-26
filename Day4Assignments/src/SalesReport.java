public class SalesReport {
    public static void main(String[] args) {

    	int[] monthlySales = {125000, 93000, 80000, 75000, 84000, 110000, 105000, 120000, 90000, 115000, 123000, 150000};
        String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        
        int[] quarterlySales = new int[4];
        for (int i = 0; i < 12; i++) {
            int quarter = i / 3;
            quarterlySales[quarter] += monthlySales[i];
        }
        
        
        int totalSales = 0;
        for (int i = 0; i < 12; i++) {
            totalSales += monthlySales[i];
        }
        
        
        System.out.println("Monthly Sales:");
        for (int i = 0; i < 12; i++) {
            System.out.println(month[i] + " " + monthlySales[i]);
        }
        
        
        System.out.println("\nQuarterly Sales:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Quarter " + (i+1) + ": " + quarterlySales[i]);
        }
        
        
        System.out.println("\nTotal Sales: " + totalSales);
    }
    
    }
