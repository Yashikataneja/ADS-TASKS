public class leetcode28 {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(); 
        int n = needle.length();   
        for (int i = 0; i < m - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) { 
                return i;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        leetcode28 solution = new leetcode28();
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Example 1 Output: " + solution.strStr(haystack1, needle1));  
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Example 2 Output: " + solution.strStr(haystack2, needle2));  
    }
}
