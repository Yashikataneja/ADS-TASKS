class NumArray {
    private int[] prefix;
    // Constructor initializes the prefix sum array
    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i)
            prefix[i + 1] = nums[i] + prefix[i];
    }
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
public class problem303 {
    public static void main(String[] args) {
        // Initialize the input array
        int[] nums = {-2, 0, 3, -5, 2, -1};
        // Create the NumArray object
        NumArray numArray = new NumArray(nums);
        System.out.println("[null, " + numArray.sumRange(0, 2) + ", " + numArray.sumRange(2, 5) + ", " + numArray.sumRange(0, 5) + "]");
    }
}
