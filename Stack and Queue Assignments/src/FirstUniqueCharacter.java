import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Create a HashMap to store the count of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string to count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) 
    {
        // Example usage:
        System.out.println(firstUniqChar("leetcode"));       // Output: 0
        System.out.println(firstUniqChar("loveleetcode"));   // Output: 2
        System.out.println(firstUniqChar("aabb"));            // Output: -1
    }
}
