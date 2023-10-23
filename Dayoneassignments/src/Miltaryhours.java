import java.util.Scanner;

public class Miltaryhours {

	public static void main(String[] args) {
		
		String ampm = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the time in 24 hours");
		int miltarytime = sc.nextInt();
		int hrs = miltarytime/100;
		int min = (miltarytime%10);
		miltarytime = miltarytime/10;
		min= min+((miltarytime%10)*10);
		System.out.println(hrs+" "+min);
		if(hrs>12)
		{
			ampm="pm";
			hrs=hrs-12;
		}
		else
		{
			ampm="am";
			
		}
		System.out.println("12-hour format is "+hrs+":"+min+""+ampm );
		
	}

}
