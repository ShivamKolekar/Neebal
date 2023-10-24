import java.util.Scanner;

public class Fibonacciwithboundary {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		int firstTerm = 0, secondTerm = 1,nextTerm=0;
		System.out.println("Enter the lower bound no.  ");
		int lower=sc.nextInt();
		System.out.println("Enter the upper bound no.  ");
		int upper=sc.nextInt();
	    
	    for (int i = 1; firstTerm <= upper; ++i) 
	    {
	      if(firstTerm>=lower)
	      {
	    	 System.out.print(firstTerm + " ");
	      }
	      nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;		
	    }
	    
}
}
