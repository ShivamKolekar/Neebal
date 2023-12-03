import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = dailyTemperatures(temperatures1);
        System.out.println("Output 1: " + java.util.Arrays.toString(result1));

        int[] temperatures2 = {30, 40, 50, 60};
        int[] result2 = dailyTemperatures(temperatures2);
        System.out.println("Output 2: " + java.util.Arrays.toString(result2));

        int[] temperatures3 = {30, 60, 90};
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.println("Output 3: " + java.util.Arrays.toString(result3));
    }
}
