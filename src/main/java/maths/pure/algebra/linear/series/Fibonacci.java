package maths.pure.algebra.linear.series;


import java.math.BigInteger;


public final class Fibonacci {



    /*
     * Fast doubling metod. Matrix metodidan tezroq ishlaydi.
     * F(2n) = F(n) * (2*F(n+1) - F(n)).
     * F(2n+1) = F(n+1)^2 + F(n)^2.
     */
    public static BigInteger fastFibonacciDoubling(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int bit = Integer.highestOneBit(n); bit != 0; bit >>>= 1) {
            // Loop invariant: a = F(m), b = F(m+1)
            assert a.equals(slowFibonacci(m));
            assert b.equals(slowFibonacci(m+1));

            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;
            assert a.equals(slowFibonacci(m));
            assert b.equals(slowFibonacci(m+1));

            // Advance by one conditionally
            if ((n & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
                assert a.equals(slowFibonacci(m));
                assert b.equals(slowFibonacci(m+1));
            }
        }
        return a;
    }


    /*
     * Matrix metod.
     * [1 1]^n   [F(n+1) F(n)  ]
     * [1 0]   = [F(n)   F(n-1)].
     */
    public static BigInteger fastFibonacciMatrix(int n) {
        BigInteger[] matrix = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
        return matrixPow(matrix, n)[1];
    }

    // Matrix darajasini hisobaydi.
    private static BigInteger[] matrixPow(BigInteger[] matrix, int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
        while (n != 0) {
            if (n % 2 != 0)
                result = matrixMultiply(result, matrix);
            n /= 2;
            matrix = matrixMultiply(matrix, matrix);
        }
        return result;
    }

    // 2 ta matritsani ko'paytiradi
    private static BigInteger[] matrixMultiply(BigInteger[] x, BigInteger[] y) {
        return new BigInteger[] {
                multiply(x[0], y[0]).add(multiply(x[1], y[2])),
                multiply(x[0], y[1]).add(multiply(x[1], y[3])),
                multiply(x[2], y[0]).add(multiply(x[3], y[2])),
                multiply(x[2], y[1]).add(multiply(x[3], y[3]))
        };
    }


    /*
     * Sekin ishlaydigan oddiy metod, Dinamik.
     * F(n+2) = F(n+1) + F(n).
     */
    public static BigInteger slowFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return a;
    }


    // 2 ta BigIntegerni ko'paytiradi
    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

}