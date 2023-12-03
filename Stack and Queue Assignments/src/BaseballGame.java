import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int prev1 = stack.pop();
                int prev2 = stack.pop();
                int current = prev1 + prev2;
                stack.push(prev2);
                stack.push(prev1);
                stack.push(current);
            } else if (op.equals("D")) {
                int prev = stack.peek();
                stack.push(prev * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) 
    {
    
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops1));         
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops2)); 
        String[] ops3 = {"1", "C"};
        System.out.println(calPoints(ops3)); 
    }
}
