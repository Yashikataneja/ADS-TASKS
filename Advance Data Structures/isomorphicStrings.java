import java.util.HashMap;

public class isomorphicStrings {
    public static boolean isIsomorphicOptimized(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check mapping from s -> t
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) return false;
            } else {
                mapS.put(charS, charT);
            }

            // Check mapping from t -> s
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) return false;
            } else {
                mapT.put(charT, charS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphicOptimized("egg", "add")); 
        System.out.println(isIsomorphicOptimized("foo", "bar")); 
        System.out.println(isIsomorphicOptimized("paper", "title")); 
    }
}
