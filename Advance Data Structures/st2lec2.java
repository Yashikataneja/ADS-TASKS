/* GIVEN A STRING S= "aaaabaaaa"
 * k=1 : 9
 * k=2 : 4
 */
import java.util.HashMap;

public class st2lec2 {
    public static int solve(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }
        
        int si = 0, ei = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (ei < s.length()) {
            char ch_ei = s.charAt(ei);
            map.put(ch_ei, map.getOrDefault(ch_ei, 0) + 1);
            
            while (map.size() > k) {
                char ch_si = s.charAt(si);
                map.put(ch_si, map.get(ch_si) - 1);
                if (map.get(ch_si) == 0) {
                    map.remove(ch_si);
                }
                si++;
            }
            
            max = Math.max(max, ei - si + 1);
            ei++;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(solve("aabbcc", 2)); 
    }
}
