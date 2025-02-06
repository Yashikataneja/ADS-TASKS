import java.util.*;

class problem78 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    int totalSubsets = 1 << n; // 2^n subsets

    for (int mask = 0; mask < totalSubsets; mask++) {
      List<Integer> subset = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        if ((mask & (1 << i)) != 0) { // Check if the i-th bit is set
          subset.add(nums[i]);
        }
      }
      ans.add(subset);
    }

    return ans;
  }

  public static void main(String[] args) {
    problem78 sol = new problem78();
    System.out.println(sol.subsets(new int[]{1, 2, 3}));
  }
}
