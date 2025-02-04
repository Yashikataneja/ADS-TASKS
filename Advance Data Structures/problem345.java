public class problem345 {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = s.length() - 1;
        
        while (l < r) {
            if (!isVowel(sb.charAt(l))) {
                l++;
            } else if (!isVowel(sb.charAt(r))) {
                r--;
            } else {
                // Swap the vowels
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
        }
        return sb.toString();
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        problem345 solution = new problem345();
        String s1 = "IceCreAm";
        System.out.println("Reversed vowels for s1: " + solution.reverseVowels(s1));  
        String s2 = "leetcode";
        System.out.println("Reversed vowels for s2: " + solution.reverseVowels(s2));  
    }
}
