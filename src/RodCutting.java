public class RodCutting {
    public int RodCutting(int preço[], int index, int n) {
        if (index == 0)
            return n * preço[0];
        if (n == 0)
            return 0;

        int notCut = RodCutting(preço, index - 1, n);
        int cut = Integer.MIN_VALUE;
        int rod_length = index + 1;
        int new_length = n - rod_length;

        if (rod_length <= n)
            cut = preço[index] + RodCutting(preço, new_length - 1, new_length);

        return Math.max(notCut, cut);
    }
}
