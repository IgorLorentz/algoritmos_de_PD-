public class EditDistance {
    public int min(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    public int EditDistance(String x, String y, int m, int n) {
        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (x.charAt(m - 1) == y.charAt(n - 1))
            return EditDistance(x, y, m - 1, n - 1);

        return 1 + min(EditDistance(x, y, m, n - 1), // Insert
                EditDistance(x, y, m - 1, n), // Remove
                EditDistance(x, y, m - 1,
                        n - 1));
    }
}
