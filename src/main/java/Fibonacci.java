public class Fibonacci {

    public long getFibonacciSequence(int n) {
        if(n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long a = 0; // f(0) = 0
        long b = 1; // f(1) = 1


        // f(2) = f(1) + f(0)
        // so we can think that f(n) = f(n-1) + f(n-2), where n is positive
        long c =0;
        for (int i=2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
