import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        // Example 1
        String s1 = "III";
        int result1 = solution.romanToInt(s1);
        System.out.println("Example 1: " + result1);

        // Example 2
        String s2 = "LVIII";
        int result2 = solution.romanToInt(s2);
        System.out.println("Example 2: " + result2);

        // Example 3
        String s3 = "MCMXCIV";
        int result3 = solution.romanToInt(s3);
        System.out.println("Example 3: " + result3);
    }
}
