
public class problem560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        // Iterate over all possible subarrays
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            // Sum up elements for each subarray starting at index i
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                // Check if the sum is equal to k
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        problem560 solution = new problem560();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Number of subarrays for example 1: " + solution.subarraySum(nums1, k1));  
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Number of subarrays for example 2: " + solution.subarraySum(nums2, k2)); 
    }
}
