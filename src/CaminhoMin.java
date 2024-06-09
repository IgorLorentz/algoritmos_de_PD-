public class CaminhoMin {
    public static int CaminhoMin(int[][] M) {
        int n = M.length;
        int m = M[0].length;
        int[][] dp = new int[n][m];

        for (int j = 0; j < m; j++) {
            dp[0][j] = M[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = M[i][j] + dp[i-1][j];
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], M[i][j] + dp[i-1][j-1]);
                }
                if (j < m - 1) {
                    dp[i][j] = Math.min(dp[i][j], M[i][j] + dp[i-1][j+1]);
                }
            }
        }

        int custoMin = dp[n-1][0];
        for (int j = 1; j < m; j++) {
            custoMin = Math.min(custoMin, dp[n-1][j]);
        }

        return custoMin;
    }
}
