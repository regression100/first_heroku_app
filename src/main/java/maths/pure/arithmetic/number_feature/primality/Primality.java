package maths.pure.arithmetic.number_feature.primality;

public final class Primality {
    public static boolean isPrime(long number){
        int count=0;
        for (long i = 1; i <=number/2 ; i++) {
            if (number%i==0){
                count++;
            }
        }
        return count == 1;
    }

    public static boolean isPrimeSqrt(long number){
        long count=0;
        long g= (long) Math.sqrt(number);
        for (long i = 1; i <=g; i++) {
            if (number%i==0){
                count++;
            }
        }
        return count == 1;
    }

    public static boolean isPrimeLucasLehmer(long p) {

// generate the number
        double checkNumber = Math.pow(2, p) - 1;

// First number of the series
        double nextval = 4 % checkNumber;

// Generate the rest (p-2) terms
// of the series.
        for (long i = 1; i < p - 1; i++)
            nextval = (nextval * nextval - 2) % checkNumber;

// now if the (p-1)th term is
// 0 return true else false.
        return (nextval == 0);
    }

    static int power(int a,int n, int p)
    {
        // Initialize result
        int res = 1;

        // Update 'a' if 'a' >= p
        a = a % p;

        while (n > 0)
        {
            // If n is odd, multiply 'a' with result
            if ((n & 1) == 1)
                res = (res * a) % p;

            // n must be even now
            n = n >> 1; // n = n/2
            a = (a * a) % p;
        }
        return res;
    }

    public static boolean isPrimeFermat(int n, int k)
    {
        // Corner cases
        if (n <= 1 || n == 4) return false;
        if (n <= 3) return true;

        // Try k times
        while (k > 0)
        {
            // Pick a random number in [2..n-2]
            // Above corner cases make sure that n > 4
            int a = 2 + (int)(Math.random() % (n - 4));

            // Fermat's little theorem
            if (power(a, n - 1, n) != 1)
                return false;

            k--;
        }

        return true;
    }

}
