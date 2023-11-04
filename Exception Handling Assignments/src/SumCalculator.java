import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = Integer.parseInt(scanner.nextLine());
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        while (true) {
            try {
                System.out.print("Enter the second integer: ");
                num2 = Integer.parseInt(scanner.nextLine());
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}