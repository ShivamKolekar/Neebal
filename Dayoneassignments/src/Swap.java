import java.util.Scanner;

public class Swap 
{
	public static void main(String[] args) 
	{

	System.out.println("Enter a no. with 4 digit");
	Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();
	
	
	int a= (n%10);
	int b = ((n/10)%10); 
	int c= (n/100)%10; 
	int d= (n/1000); 
	
	System.out.println(b+""+a+""+d+""+c);
	
	}

}