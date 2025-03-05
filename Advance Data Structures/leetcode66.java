import java.util.Arrays;

public class leetcode66 { 
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }
        // If all digits were 9, we need an extra digit at the start
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1, rest will be 0
        return newDigits;
    }
    public static void main(String[] args) {
        leetcode66 solution = new leetcode66(); 
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        int[] digits4 = {9, 9, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits1))); 
        System.out.println(Arrays.toString(solution.plusOne(digits2))); 
        System.out.println(Arrays.toString(solution.plusOne(digits3))); 
        
    }
}
