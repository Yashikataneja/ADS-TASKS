class problem125 {
    public boolean isPalindrome(String s) {
      int l = 0;
      int r = s.length() - 1;
      while (l < r) {
        // Skip non-alphanumeric characters from the left
        while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
          l++;
        }
        // Skip non-alphanumeric characters from the right
        while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
          r--;
        }
        // Compare the characters at the two pointers (case insensitive)
        if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
          return false;
        }
        // Move both pointers inward
        l++;
        r--;
      }
      return true;
    }
  
    public static void main(String[] args) {
      problem125 solution = new problem125();
      String testCase1 = "A man, a plan, a canal: Panama";
      System.out.println("Input: \"" + testCase1 + "\"");
      System.out.println("Output: " + solution.isPalindrome(testCase1));  
      String testCase2 = "race a car";
      System.out.println("Input: \"" + testCase2 + "\"");
      System.out.println("Output: " + solution.isPalindrome(testCase2));  
      String testCase3 = " ";
      System.out.println("Input: \"" + testCase3 + "\"");
      System.out.println("Output: " + solution.isPalindrome(testCase3));  
    }
  }
  