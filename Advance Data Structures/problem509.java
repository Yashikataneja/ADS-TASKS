import java.util.Scanner;

public class problem509 {  // This must match the filename (case-sensitive)
    public int fib(int n) {
        if (n < 2)
            return n;

        int[] dp = {0, 0, 1}; // Initialize base cases

        for (int i = 2; i <= n; ++i) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
        }

        return dp[2];
    }

    public static void main(String[] args) {  // Move main method here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        problem509 solution = new problem509();  // Create instance
        int result = solution.fib(n);

        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
