import java.util.Scanner;

public class DuplicateChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of integers: ");
        int count = 5;

        int[] numbers = new int[count];
        System.out.println("Input the Integers:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkDuplicates(int[] numbers) throws DuplicateNumberException {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
                }
            }
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}




