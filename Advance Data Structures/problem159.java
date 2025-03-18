import java.util.HashMap;
import java.util.Map;

class problem159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> cnt = new HashMap<>();
        int n = s.length();
        int ans = 0;
        for (int i = 0, j = 0; i < n; ++i) {
            char c = s.charAt(i);
            cnt.put(c, cnt.getOrDefault(c, 0) + 1);
            while (cnt.size() > 2) {
                char t = s.charAt(j++);
                cnt.put(t, cnt.get(t) - 1);
                if (cnt.get(t) == 0) {
                    cnt.remove(t);
                }
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        problem159 solution = new problem159();
        String s = "eceba";
        int result = solution.lengthOfLongestSubstringTwoDistinct(s);
        System.out.println("Longest substring length with at most two distinct characters: " + result);
    }
}
