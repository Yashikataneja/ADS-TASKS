


// //find the smallest substring in the first string 
// //that contains all the characters of the second string : 

// //if s1 and s2 are null or s1 length is less than s2 length,
// //we need to return the null sting.



import java.util.HashMap;

class StringManipulation {
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

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);  // Fix the substring method
    }

    public static void main(String[] args) {
        // Create an instance of the StringManipulation class
        StringManipulation sm = new StringManipulation();

        // Test cases
        String s = "ADOBECODEBANC";
        String t = "ABC";

        // Call the minWindow method and print the result
        String result = sm.minWindow(s, t);
        System.out.println("The minimum window substring is: " + result);  // Expected output: "BANC"
    }
}
