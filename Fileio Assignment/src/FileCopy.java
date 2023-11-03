import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        String sourceFileName = "src/input.txt";
        String destinationFileName = "src/copyinput.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
