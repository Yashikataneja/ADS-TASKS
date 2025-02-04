class problem27 {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for the position to insert non-val elements

        // Traverse through each element in the array
        for (final int num : nums) {
            if (num != val) {
                nums[i++] = num; // Place the current element at the correct position
            }
        }

        return i; 
    }
    public static void main(String[] args) {
        problem27 solution = new problem27();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int newLength1 = solution.removeElement(nums1, val1);
        System.out.println("New length: " + newLength1);
        System.out.print("Updated nums: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int newLength2 = solution.removeElement(nums2, val2);
        System.out.println("New length: " + newLength2);
        System.out.print("Updated nums: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
