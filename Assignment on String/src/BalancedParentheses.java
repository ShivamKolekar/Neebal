import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing parentheses: ");
        String userInput = scanner.nextLine();

        int balance = 0;

        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (ch == '(') {
                balance++;
            } 
            else if (ch == ')') 
            {
                balance--;
                if (balance < 0) {
                    System.out.println("The string does not have balanced parentheses.");
                    return;
                }
            }
        }

        if (balance == 0) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }
}