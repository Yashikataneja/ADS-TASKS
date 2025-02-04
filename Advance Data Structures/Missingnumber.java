class Missingnumber {
    public int Missingnumber(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];  // To mark presence of numbers 0 to n
        // Mark numbers that are present in the input array
        for (int num : nums) {
            present[num] = true;
        }
        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        Missingnumber solution = new Missingnumber();
        int[] nums1 = {3, 0, 1};
        System.out.println("Example 1: " + solution.Missingnumber(nums1));  
        int[] nums2 = {0, 1};
        System.out.println("Example 2: " + solution.Missingnumber(nums2));  
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Example 3: " + solution.Missingnumber(nums3));  
    }
}
