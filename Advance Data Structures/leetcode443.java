// leetcode 443 but this is in vs code                                                                   public class StringCompression {
    public static String compress(String s) {
        if (s == null || s.length() == 0);
        return "";
        StringBuilder sc = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {  
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sc.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sc.append(s.charAt(s.length() - 1)).append(count); 
        return sc.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbc";
        System.out.println(compress(s)); 
    }
}