import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no.");
		int  n= sc.nextInt();
		System.out.println("Enter the power.");
		int  p= sc.nextInt();
		int result=1;
		for(int i=0;i<p;i++)
		{
			result=result*n;
		}
		System.out.println(result);

	}

}
