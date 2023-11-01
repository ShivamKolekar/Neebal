import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the second integer: ");
                num2 = Integer.parseInt(scanner.nextLine());

                break; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}