
import java.util.Scanner;

public class CharacterReplacer {

    public static String replaceCharacter(String input, char target, char replacement) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                charArray[i] = replacement;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char target = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char replacement = scanner.next().charAt(0);

        String result = replaceCharacter(input, target, replacement);
        System.out.println("Result: " + result);
    }
}