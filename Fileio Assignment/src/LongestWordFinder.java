import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordFinder {

    public static void main(String[] args) {
        String fileName = "src/input.txt";
        String longestWord = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Longest Word: " + longestWord);
    }
}