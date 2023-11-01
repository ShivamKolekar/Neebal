import java.util.Scanner;

class InvalidStringException extends Exception {
    public InvalidStringException(String message) {
        super(message);
    }
}

public class Vowel_Main 
{
    public static int countVowels(String input) throws InvalidStringException {
        if (input == null || input.isEmpty()) {
            throw new InvalidStringException("Input string is null or empty.");
        }

        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            int vowelCount = countVowels(inputString);

            System.out.println("Number of vowels in the string: " + vowelCount);
        } catch (InvalidStringException e) {
            System.out.println(e.getMessage());
        }
    }
}