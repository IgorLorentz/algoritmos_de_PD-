public class FibonacciMem {
    public static int FibonacciMem(int n) {
        int[] fib = new int[1000];

        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib[n] = FibonacciMem(n - 1) + FibonacciMem(n - 2);
    }
}
