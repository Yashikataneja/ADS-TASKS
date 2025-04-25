
class gfgKnapsack {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        Integer[][] dp = new Integer[n + 1][W + 1];
        return solve(0, W, val, wt, dp);
    }

    private static int solve(int i, int cap, int[] val, int[] wt, Integer[][] dp) {
        if (i == val.length) return 0;

        if (dp[i][cap] != null) return dp[i][cap];

        int include = 0;
        if (cap >= wt[i]) {
            include = val[i] + solve(i + 1, cap - wt[i], val, wt, dp);
        }

        int exclude = solve(i + 1, cap, val, wt, dp);

        dp[i][cap] = Math.max(include, exclude);
        return dp[i][cap];
    }
}