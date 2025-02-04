import java.util.HashMap;
public class problem76{
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> windowCount = new HashMap<>();
        int start = 0, matched = 0, minLength = Integer.MAX_VALUE;
        int minStart = 0;
        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            windowCount.put(endChar, windowCount.getOrDefault(endChar, 0) + 1);  // Increment the count of endChar
            if (charFreq.containsKey(endChar) && windowCount.get(endChar).equals(charFreq.get(endChar))) {
                matched++;
            }
            while (matched == charFreq.size()) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }
                char startChar = s.charAt(start);
                windowCount.put(startChar, windowCount.get(startChar) - 1);  // Decrement the count of startChar
                
                if (charFreq.containsKey(startChar) && windowCount.get(startChar) < charFreq.get(startChar)) {
                    matched--;
                }
                
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
    public static void main(String[] args) {
        problem76 solution = new problem76();
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Example 1: " + solution.minWindow(s1, t1));  
        String s2 = "a";
        String t2 = "a";
        System.out.println("Example 2: " + solution.minWindow(s2, t2)); 
        String s3 = "a";
        String t3 = "aa";
        System.out.println("Example 3: " + solution.minWindow(s3, t3));  
    }
}
