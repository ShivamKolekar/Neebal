import java.util.Scanner;


	public class Daysconverter {

		public static void main(String[] args) 
		{
			System.out.println("Enter a no.of days");
			Scanner sc = new Scanner(System.in);
			
			int n=sc.nextInt();
		
			int year = n/365;
			
			n=n%365;
			
			int months = n/30; //3
			
			n=n%30;
				
			int weeks = n/7;
			
			int days= n%7;
			
			System.out.println(year+" years  "+months+" months "+weeks+" weeks "+days+" days");

		}

}