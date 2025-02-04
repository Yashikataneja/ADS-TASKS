public class problem2256 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            // Calculate the average of the left side (prefix)
            int leftSum = 0;
            for (int j = 0; j <= i; ++j) {
                leftSum += nums[j];
            }
            int leftAvg = leftSum / (i + 1);
            // Calculate the average of the right side (suffix)
            int rightSum = 0;
            for (int j = i + 1; j < n; ++j) {
                rightSum += nums[j];
            }
            int rightAvg = (n - i - 1) > 0 ? rightSum / (n - i - 1) : 0;
            // Compute the absolute difference between the left and right averages
            int diff = Math.abs(leftAvg - rightAvg);
            // Update the minimum difference and the index if a smaller difference is found
            if (diff < minDiff) {
                minDiff = diff;
                ans = i;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        problem2256 solution = new problem2256();
        int[] nums1 = {2, 5, 3, 9, 5, 3};
        System.out.println("Index with minimum average difference for nums1: " + solution.minimumAverageDifference(nums1));
        int[] nums2 = {0};
        System.out.println("Index with minimum average difference for nums2: " + solution.minimumAverageDifference(nums2)); // Expected output: 0
    }
}
