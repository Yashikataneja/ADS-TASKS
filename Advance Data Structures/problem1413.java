class problem1413 {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        // Iterate through the array to calculate the minimum sum encountered during the iteration
        for (final int num : nums) {
            sum += num; // Accumulate the sum step-by-step
            minSum = Math.min(minSum, sum); // Track the minimum sum encountered
        }
        // The result is 1 minus the minimum sum to ensure the start value is positive
        return 1 - minSum;
    }
    public static void main(String[] args) {
        problem1413 solution = new problem1413();
        int[] nums1 = {-3, 2, -3, 4, 2};
        System.out.println("Minimum start value for nums1: " + solution.minStartValue(nums1)); 
        int[] nums2 = {1, 2};
        System.out.println("Minimum start value for nums2: " + solution.minStartValue(nums2)); 
        int[] nums3 = {1, -2, -3};
        System.out.println("Minimum start value for nums3: " + solution.minStartValue(nums3)); 
    }
}
