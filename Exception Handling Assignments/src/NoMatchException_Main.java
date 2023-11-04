import java.util.Scanner;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class NoMatchException_Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String country = scanner.nextLine();

            if (!country.equals("India")) {
                throw new NoMatchException("String does not match 'India'");
            }

            System.out.println("String matches 'India'");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}