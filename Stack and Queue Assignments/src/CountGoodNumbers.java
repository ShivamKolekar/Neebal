public class CountGoodNumbers {

    private static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenChoices = 5; // 0, 2, 4, 6, 8
        long primeChoices = 4; // 2, 3, 5, 7

        return (int) (pow(evenChoices, (n + 1) / 2) * pow(primeChoices, n / 2) % MOD);
    }

    private long pow(long x, long y) {
        long result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        CountGoodNumbers solution = new CountGoodNumbers();

        // Example 1
        int n1 = 1;
        int result1 = solution.countGoodNumbers(n1);
        System.out.println("Example 1: " + result1);

        // Example 2
        int n2 = 4;
        int result2 = solution.countGoodNumbers(n2);
        System.out.println("Example 2: " + result2);

        // Example 3
        int n3 = 50;
        int result3 = solution.countGoodNumbers(n3);
        System.out.println("Example 3: " + result3);
    }
}
