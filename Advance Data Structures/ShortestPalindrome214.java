public class ShortestPalindrome214 {
    class Solution {
        public String shortestPalindrome(String s) {
           int n=s.length();
           if(n==0 || n==1)
             return s;
           int left=0;
           int right=n-1;
           while(right>=0)
           {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
            }
            right--;
           }
    
           if(left==n)
           {
            return s;
           }
    
           String nonPalindromicSuffix=s.substring(left);
           StringBuilder reverseString=new StringBuilder(nonPalindromicSuffix).reverse();
           return reverseString.append(shortestPalindrome(s.substring(0,left))).append(nonPalindromicSuffix).toString();
    
        }
    }
    
}