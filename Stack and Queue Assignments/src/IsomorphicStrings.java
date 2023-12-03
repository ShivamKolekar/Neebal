import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToTMapping = new HashMap<>();
        Map<Character, Character> tToSMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if there is a mapping from s to t
            if (sToTMapping.containsKey(charS)) {
                if (sToTMapping.get(charS) != charT) {
                    return false;
                }
            } else {
                // Check if there is a mapping from t to s
                if (tToSMapping.containsKey(charT)) {
                    return false;
                }

                // Create mappings
                sToTMapping.put(charS, charT);
                tToSMapping.put(charT, charS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();

        // Example 1
        String s1 = "egg";
        String t1 = "add";
        boolean result1 = solution.isIsomorphic(s1, t1);
        System.out.println("Example 1: " + result1);

        // Example 2
        String s2 = "foo";
        String t2 = "bar";
        boolean result2 = solution.isIsomorphic(s2, t2);
        System.out.println("Example 2: " + result2);

        // Example 3
        String s3 = "paper";
        String t3 = "title";
        boolean result3 = solution.isIsomorphic(s3, t3);
        System.out.println("Example 3: " + result3);
    }
}
