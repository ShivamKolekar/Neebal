import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String reversed="";
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("[^a-zA-Z0-9 ]", "");
        input = cleanInput; 
        //System.out.println(cleanInput);
        StringBuilder reversed = new StringBuilder();
        int wordEnd = input.length();

        for(int i = input.length() - 1; i >= 0; i--) 
        {
            if(input.charAt(i) == ' ' || i == 0) 
            {
                int wordStart = (i == 0) ? 0 : i + 1;
                reversed.append(input, wordStart, wordEnd).append(" ");
                wordEnd = i;
            }
        }
        
        System.out.println("Reversed sentence: " + reversed);        
    }
}