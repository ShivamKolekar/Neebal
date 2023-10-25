
public class StarTriangle {

	public static void main(String[] args) {
		char x= ' ';
		char y ='*';
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
			System.out.print(x);
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
