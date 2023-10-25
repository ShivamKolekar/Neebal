
public class Hollownumberdiamond {

	public static void main(String[] args) {
		      
		        int row_size=9;
		        int control=(row_size/2)+1;  
		        int x=1;
		        for(int i=1;i<=row_size;i++) 
		        {
		            for(int j=1;j<=row_size;j++) 
		            {
		                if((j==control)||(j==row_size-control+1))
		                {
		                    System.out.print(x);
		                }
		                else
		                {
		                     System.out.print(" ");
		                }
		            }
		            if(i<=row_size/2)
		            {
		                x++;
		                control--;
		            }
		            else
		            {
		                x--;
		                control++;
		            }
		            System.out.println();
		        }
		    }
} 
