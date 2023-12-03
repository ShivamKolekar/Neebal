import java.util.PriorityQueue;

public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // Keep the heap size <= k
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The top of the minHeap will be the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Output 1: " + findKthLargest(nums1, k1)); // Output: 5

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Output 2: " + findKthLargest(nums2, k2)); // Output: 4
    }
}
