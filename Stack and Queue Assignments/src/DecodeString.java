import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(currentNum);
                strStack.push(currentStr);
                currentNum = 0;
                currentStr = new StringBuilder();
            } else if (ch == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder tempStr = new StringBuilder();
                for (int i = 0; i < repeatTimes; i++) {
                    tempStr.append(currentStr);
                }
                currentStr = strStack.pop().append(tempStr);
            } else {
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        System.out.println("Output 1: " + decodeString(s1));

        String s2 = "3[a2[c]]";
        System.out.println("Output 2: " + decodeString(s2));

        String s3 = "2[abc]3[cd]ef";
        System.out.println("Output 3: " + decodeString(s3));
    }
}
