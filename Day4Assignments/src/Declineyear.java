public class Declineyear {
		    
	public static void main(String[] args) {
		int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		int declineYear = 0;
		
		for (int i = 1; i < profits.length; i++) {
            if (profits[i] < profits[i-1]) {
            	declineYear = i;
            	break;
            }
        }

		if (declineYear != 0) {
			System.out.println("The decline in profits began in year " + (2001 + declineYear));
		} 
		else 
		{
		            System.out.println("There was no decline in profits.");
		}
	
	} 
}


