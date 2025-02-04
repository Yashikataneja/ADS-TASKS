public class problem1652{
    public int[] decrypt(int[] code, int k) {
        final int n = code.length;
        int[] ans = new int[n];
        // If k is 0, all elements in the result should be 0
        if (k == 0) {
            return ans;
        }
        // Brute-force approach to calculate the sum for each index based on k
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Calculate the sum of the next k numbers if k > 0 or previous k numbers if k < 0
            for (int j = 1; j <= Math.abs(k); j++) {
                int index = (i + (k > 0 ? j : -j) + n) % n;
                sum += code[index];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        problem1652 solution = new problem1652();
        int[] code1 = {5, 7, 1, 4};
        int k1 = 3;
        int[] result1 = solution.decrypt(code1, k1);
        System.out.print("Decrypted code  ");
        for (int res : result1) {
            System.out.print(res + " ");
        }
        System.out.println(); 
        int[] code2 = {1, 2, 3, 4};
        int k2 = 0;
        int[] result2 = solution.decrypt(code2, k2);
        System.out.print("Decrypted code ");
        for (int res : result2) {
            System.out.print(res + " ");
        }
        System.out.println(); 
        int[] code3 = {2, 4, 9, 3};
        int k3 = -2;
        int[] result3 = solution.decrypt(code3, k3);
        System.out.print("Decrypted code  ");
        for (int res : result3) {
            System.out.print(res + " ");
        }
        System.out.println(); 
    }
}

