class problem459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) { // Only check lengths that divide the string evenly
                String substring = s.substring(0, len);
                int repeatCount = n / len;
                StringBuilder repeated = new StringBuilder();
                
                // Repeat the substring repeatCount times
                for (int i = 0; i < repeatCount; i++) {
                    repeated.append(substring);
                }
                
                // Check if the repeated string equals the original string
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        problem459 solution = new problem459();
        String testCase1 = "abab";
        System.out.println("Input: \"" + testCase1 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(testCase1)); 
        String testCase2 = "aba";
        System.out.println("Input: \"" + testCase2 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(testCase2));  
        String testCase3 = "abcabcabcabc";
        System.out.println("Input: \"" + testCase3 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(testCase3));  
    }
}
