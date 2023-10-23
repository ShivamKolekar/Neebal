import java.util.Scanner;

public class Bluebirdbus {

	public static void main(String[] args) {

		System.out.println("Enter number of bookings ");
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int passsengars = (50)*(x/50);
		System.out.println("People Travelling = "+passsengars);
	}

}
