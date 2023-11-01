import java.util.Scanner;

class DuplicateNumberException extends Exception 
{
    public DuplicateNumberException(String message) 
    {
        super(message);
    }
}

public class DuplicateChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the integers separated by spaces ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        try 
        {
            checkForDuplicates(inputArray);
            System.out.println("No duplicate numbers!");
        } 
        
        catch (DuplicateNumberException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForDuplicates(String[] numbers) throws DuplicateNumberException 
    {
        for (int i = 0; i < numbers.length; i++) 
        {
            for (int j = i + 1; j < numbers.length; j++) 
            {
                if (numbers[i].equals(numbers[j])) 
                {
                    throw new DuplicateNumberException("Error: Duplicate number found: " + numbers[i]);
                }
            }
        }
    }
}