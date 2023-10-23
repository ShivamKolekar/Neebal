import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name:");
		String name = sc.nextLine();
		System.out.println("Enter the units consumed");
		int unit=sc.nextInt();
		double billamount=0;
		if(unit<=100)
		{
			billamount =unit*4;
		}
		else if(unit>100 && unit<=300)
		{
			double unitconsumed100to300 = unit-100;
			billamount = (100*4)+(unitconsumed100to300 *5);
			if(billamount>1000)
				billamount = billamount + (billamount*0.05);
		}
		else if(unit>300)
		{
			double unitconsumedabove300 = unit -300 ;
			billamount = (100*4) + (200*5) + (unitconsumedabove300*10);
			billamount = billamount + (billamount*0.05);
		}
		double totalamount = billamount + billamount*0.18;
		
		System.out.println("Name: "+name);
		System.out.println("Units: "+unit);
		System.out.println("Amount"+totalamount);
	


			
	}

}
