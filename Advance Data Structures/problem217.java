class problem217 {
    public boolean containsDuplicate(int[] nums) {
        // Brute force: Compare each element with every other element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }
    public static void main(String[] args) {
        problem217 solution = new problem217();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test case 1: " + solution.containsDuplicate(nums1)); 
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: " + solution.containsDuplicate(nums2)); 
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test case 3: " + solution.containsDuplicate(nums3)); 
    }
}

