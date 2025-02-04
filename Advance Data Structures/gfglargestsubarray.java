import java.util.HashMap;

class gfglargestsubarray {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0; 
        int sum = 0; 
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i]; 
            if (sum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength; 
    }

    public static void main(String args[]) {
        gfglargestsubarray solution = new gfglargestsubarray();
        int arr1[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(solution.maxLen(arr1));  
        int arr2[] = {2, 10, 4};
        System.out.println(solution.maxLen(arr2));  
        int arr3[] = {1, 0, -4, 3, 1, 0};
        System.out.println(solution.maxLen(arr3));  
    }
}
