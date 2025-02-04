public class StringProblem1 {

    // Finding the exact matches of short strings within larger texts

    // KMP : Knuth-Morris-Pratt algorithm
    private static int[] compute(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];  // LPS: Longest Prefix which is also Suffix
        int len = 0;  // Length of the previous longest prefix suffix
        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];  // Use the previous LPS value
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = compute(pattern);  // Compute LPS array
        int i = 0;  // Index for text
        int j = 0;  // Index for pattern

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {  // Found a match
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1];  // Continue searching for next potential match
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];  // Use LPS to skip some comparisons
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        search(text, pattern);
    }
}
