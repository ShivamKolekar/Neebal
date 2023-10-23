import java.util.Scanner;

public class MilliSec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the time in milliseconds");
		
		long milliseconds=sc.nextLong();
 
        
        long minutes = ((milliseconds / 1000) / 60)%60;
        long seconds = (milliseconds / 1000) % 60;
        long hours = ((milliseconds / (1000*60*60)) % 24);
        
        System.out.println("Time in Long is");
        System.out.println(hours+" : "+minutes+" : "+seconds);
		
	}

}
