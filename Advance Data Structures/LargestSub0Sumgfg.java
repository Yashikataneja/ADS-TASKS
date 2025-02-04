import java.util.HashMap;

public class LargestSub0Sumgfg {
    class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            if (prefixMap.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum));
            } else {
               
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }

}
}