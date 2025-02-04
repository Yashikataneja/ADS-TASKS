public class problem918{
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            // Consider subarrays starting at index i
            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;  // This ensures the circular behavior
                currentSum += nums[index];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        problem918 solution = new problem918();
        int[] nums1 = {1, -2, 3, -2};
        System.out.println("Max subarray sum for example 1: " + solution.maxSubarraySumCircular(nums1));  
        int[] nums2 = {5, -3, 5};
        System.out.println("Max subarray sum for example 2: " + solution.maxSubarraySumCircular(nums2));  
        int[] nums3 = {-3, -2, -3};
        System.out.println("Max subarray sum for example 3: " + solution.maxSubarraySumCircular(nums3));  
    }
}

