public class LSC {
    public int LSC(String x, String y, int m, int n, int dp[][]) {


        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            dp[m][n] = 1 + LSC(x, y, m - 1, n - 1, dp);
            return dp[m][n];
        }


        dp[m][n] = Math.max(LSC(x, y, m, n - 1, dp),
                LSC(x, y, m - 1, n, dp));
        return dp[m][n];
    }
}

