import java.io.*;

public class FileAppend
{

    public static void main(String[] args) 
    {
        String fileName = "src/input.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter the text to append: ");
            String textToAppend = br.readLine();

            bw.write(textToAppend);
            bw.newLine();

            System.out.println("Text appended successfully.");
        } 
        catch(IOException e) 
        {
            e.printStackTrace();
        }
    }
}