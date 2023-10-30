import java.util.*;

public class StringCompressor 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) 
        {
            if (input.charAt(i) == input.charAt(i - 1)) 
            {
                count++;
            } 
            else 
            {
                compressed.append(input.charAt(i - 1));
                if (count > 1) 
                {
                    compressed.append(count);
                }
                count = 1;
            }
        }
//abcc
        compressed.append(input.charAt(input.length() - 1));
        if (count > 1) 
        {
            compressed.append(count);
        }
        System.out.println(compressed);

       
    }
}