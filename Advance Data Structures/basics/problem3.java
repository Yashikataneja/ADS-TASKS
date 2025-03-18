/* GIVEN A STRING S, FIND THELENGTH OF THE LONGEST SUBSTRING
 * WITHOUT REPEATING CHARACTERS .
 * 
 * s="abcabcbb";
 * 
 * Approach : 
 * 
 * Sliding window and hashset :
 * Use two pointers (left and right to dine the window)
 * ) use hashset to tract characters in current window
 * expand right until we find a duplicate char.
 * when duplicate is found, shrink left until the substring becomes valid
 */
import java.util.*; 

public class problem3 {
    public static int LenLongSub(String s){
        Set<Character>set=new HashSet<>();
        int le=0,maxen=0;
        for(int ri=0;ri<s.length();ri++){
            while(set.contains(s.charAt(ri))){
                set.remove(s.charAt(le));
                le++;

            }
            set.add(s.charAt(ri));
            maxen=Math.max(maxen,ri-le+1);
        }
        return maxen;
    }
    public static void main(String[] args){
        System.out.println(LenLongSub("abcabcbb"));
    }
    
}
