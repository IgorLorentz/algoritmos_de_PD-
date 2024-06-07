public class MochilaBool {
    public static int MochilaBool(int w[], int v[], int n, int W) {
        int[][] t = new int[n + 1][W + 1];

        for (int y = 0; y <= W; y++) {
            t[0][y] = 0;

            for (int i = 0; i <= n; i++) {
                int a = t[i - 1][y];
                int b = 0;

                if (w[i] > y) b = 0;
                else b = t[i - 1][y - w[i - 1]] + v[i - 1];

                t[i][y] = Math.max(a, b);
            }
        }

        return t[n][W];
    }
}
