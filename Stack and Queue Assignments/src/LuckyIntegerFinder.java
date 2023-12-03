import java.util.HashMap;
import java.util.Map;

public class LuckyIntegerFinder {

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxLucky = -1;

        // Iterate through the map to find the largest lucky integer
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (num == frequency) {
                // Update maxLucky if the current number is lucky and greater than the current maxLucky
                maxLucky = Math.max(maxLucky, num);
            }
        }

        return maxLucky;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {2, 2, 3, 4};
        System.out.println(findLucky(arr1)); // Output: 2

        int[] arr2 = {1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr2)); // Output: 3

        int[] arr3 = {2, 2, 2, 3, 3};
        System.out.println(findLucky(arr3)); // Output: -1
    }
}
