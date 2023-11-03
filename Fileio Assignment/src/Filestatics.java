import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filestatics {

    public static void main(String[] args) {
        String fileName = "src/input.txt";
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                characterCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);
    }
}