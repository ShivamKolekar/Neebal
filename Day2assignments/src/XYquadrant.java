import java.util.Scanner;

public class XYquadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = sc.nextInt();
		System.out.println("Enter y value");
		int y = sc.nextInt();
		String area="";
		if(x>0 && y>0)
			area="Ist quadrant";
		else if(x<0 && y>0)
			area="IInd quadrant";
		else if(x<0 && y<0)
			area="IIIrd quadrant";
		else if(x>0 && y<0)
			area="IVth quadrant";
		else if(x>0 && y==0)
			area="x-axis";
		else if(y>0 && x==0)
			area="y-axis";
		else
			area="co-odinate 0,0";
		System.out.println(area);
	}

}
