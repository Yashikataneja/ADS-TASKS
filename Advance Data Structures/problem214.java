class problem214 {
    public String shortestPalindrome(String s) {
        int n = s.length();
        for (int i = n - 1; i >= 0; --i) {
            // Check if the prefix s[0:i+1] is a palindrome
            if (isPalindrome(s, 0, i)) {
                // If it's a palindrome, return the rest of the string reversed and appended to the front
                String suffix = s.substring(i + 1);
                StringBuilder reversedSuffix = new StringBuilder(suffix).reverse();
                return reversedSuffix.toString() + s;
            }
        }
        StringBuilder reversed = new StringBuilder(s).reverse();
        return reversed.toString() + s;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        problem214 solution = new problem214();
        String testCase1 = "aacecaaa";
        System.out.println("Input: \"" + testCase1 + "\"");
        System.out.println("Output: " + solution.shortestPalindrome(testCase1));  
        String testCase2 = "abcd";
        System.out.println("Input: \"" + testCase2 + "\"");
        System.out.println("Output: " + solution.shortestPalindrome(testCase2));  
    }
}
