import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    int count =1;

	    for (int i = 1; count <= 10; ++i) 
	    {
	      if(firstTerm%2==0)
	      {
	    	 System.out.print(firstTerm + " ");
	    	 count++;
	      }
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;		
	    }
	    
}
}
