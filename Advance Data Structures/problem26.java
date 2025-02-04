
public class problem26{
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; ++i) {
            boolean isDuplicate = false;
            // Compare the current element with the previous elements
            for (int j = 0; j < i; ++j) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If the element is not a duplicate, place it in the next available spot
            if (!isDuplicate) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // Return the number of unique elements
    }
    public static void main(String[] args) {
        problem26 solution = new problem26();
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.print("Example 1 Output: " + k1 + ", nums = [");
        for (int i = 0; i < k1; ++i) {
            System.out.print(nums1[i]);
            if (i < k1 - 1) System.out.print(", ");
        }
        System.out.println("]");
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.print("Example 2 Output: " + k2 + ", nums = [");
        for (int i = 0; i < k2; ++i) {
            System.out.print(nums2[i]);
            if (i < k2 - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
