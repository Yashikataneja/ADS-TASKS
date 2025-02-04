public class problem724 {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum
            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1; // Return -1 if no pivot index is found
    }
    public static void main(String[] args) {
        problem724 problem = new problem724();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index for nums1: " + problem.pivotIndex(nums1));
        int[] nums2 = {1, 2, 3};
        System.out.println("Pivot index for nums2: " + problem.pivotIndex(nums2));
        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot index for nums3: " + problem.pivotIndex(nums3));
    }
}
