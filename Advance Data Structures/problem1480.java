public class problem1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];  // Update the current element with the sum of the current and previous elements
        }
        return nums;
    }

    public static void main(String[] args) {
        problem1480 problem = new problem1480();
        
        // Example 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Running sum for nums1: " + java.util.Arrays.toString(problem.runningSum(nums1)));
        
        // Example 2
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Running sum for nums2: " + java.util.Arrays.toString(problem.runningSum(nums2)));
        
        // Example 3
        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println("Running sum for nums3: " + java.util.Arrays.toString(problem.runningSum(nums3)));
    }
}
