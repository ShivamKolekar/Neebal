import java.util.Random;
import java.util.Scanner;

public class ArrayElementAccess {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(100);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the array (0-99): ");
        int index = scanner.nextInt();

        try {
            int element = getElement(randomArray, index);
            System.out.println("Element at index " + index + " is: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); 
        }

        return array;
    }

    public static int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }
}