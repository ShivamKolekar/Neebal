public class ArrangingCoins {

    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long totalCoins = mid * (mid + 1) / 2;

            if (totalCoins == n) {
                return (int)mid;
            } else if (totalCoins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int)right; // If the last row is incomplete, return the previous row
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(arrangeCoins(n1));  // Output: 2

        int n2 = 8;
        System.out.println(arrangeCoins(n2));  // Output: 3
    }
}
