import java.util.Arrays;

public class CheckArrayGood {

    public static boolean isGoodArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                return nums[i - 1] == i;
            } else if (nums[i - 1] != i && nums[i] != i) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 3};
        System.out.println(isGoodArray(nums1));  
        int[] nums2 = {1, 3, 3, 2};
        System.out.println(isGoodArray(nums2));  

        int[] nums3 = {1, 1};
        System.out.println(isGoodArray(nums3)); 

        int[] nums4 = {3, 4, 4, 1, 2, 1};
        System.out.println(isGoodArray(nums4));  
    }
}
