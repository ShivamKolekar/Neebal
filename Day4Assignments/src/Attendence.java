
public class Attendence {

	public static void main(String[] args) 
	{

		int[] arr= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		
		double count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		
		double percentage= (count/arr.length)*100;
				
		System.out.printf("Student attendance is %.2f%%",percentage);
	}

}
