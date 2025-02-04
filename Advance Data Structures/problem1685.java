class problem1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        // Fill prefix sum array
        prefix[0] = nums[0];
        for (int i = 1; i < n; ++i)
            prefix[i] = prefix[i - 1] + nums[i];
        // Fill suffix sum array
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; --i)
            suffix[i] = suffix[i + 1] + nums[i];
        // Calculate the sum of absolute differences for each index
        for (int i = 0; i < nums.length; ++i) {
            final int left = nums[i] * (i + 1) - prefix[i];
            final int right = suffix[i] - nums[i] * (n - i);
            ans[i] = left + right;
        }
        return ans;
    }
    public static void main(String[] args) {
        problem1685 solution = new problem1685();
        int[] nums1 = {2, 3, 5};
        int[] result1 = solution.getSumAbsoluteDifferences(nums1);
        System.out.print("Result for nums1: ");
        for (int res : result1) {
            System.out.print(res + " ");
        }
        System.out.println(); 
        int[] nums2 = {1, 4, 6, 8, 10};
        int[] result2 = solution.getSumAbsoluteDifferences(nums2);
        System.out.print("Result for nums2: ");
        for (int res : result2) {
            System.out.print(res + " ");
        }
        System.out.println(); 
    }
}
