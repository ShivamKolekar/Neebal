import java.util.Scanner;

public class HollowPolygon {
	
	
	public static void main(String[] args) {
	
		int rows = 5;
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = i ; j > 0; j-- ) 
			{
				System.out.print(" ");
			}
			if (i == 1 || i == rows) //for horizontal stars 
			{
				for (int k = 1 ; k <= rows*2; k++ ) 
				{
					System.out.print("* ");
				}		
			}
			else  //for vertical stars
			{
				for (int k = 1 ; k <= rows*2; k++ ) 
				{
					if (k == 1 || k == rows*2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}