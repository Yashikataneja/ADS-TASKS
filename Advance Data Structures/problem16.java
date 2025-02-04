import java.util.Arrays;
class problem16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Sort the array
        int closestSum = Integer.MAX_VALUE;  // Initialize closestSum with a very large value
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;  // Left pointer, starts after the current number
            int right = nums.length - 1;  // Right pointer, starts from the end of the array
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];  // Calculate the sum of the three numbers
                // If the current sum is closer to the target, update closestSum
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                }
                // If current sum is greater than target, move the right pointer to the left
                else if (currentSum > target) {
                    right--;
                }
                // If current sum is equal to target, we've found the closest sum
                else {
                    return currentSum;
                }
            }
        }
        return closestSum;  // Return the closest sum found
    }
    // Main function to test the solution
    public static void main(String[] args) {
        problem16 solution = new problem16();
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Example 1: " + solution.threeSumClosest(nums1, target1)); 
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Example 2: " + solution.threeSumClosest(nums2, target2)); 
    }
}
