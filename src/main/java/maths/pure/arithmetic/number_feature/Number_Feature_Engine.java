package maths.pure.arithmetic.number_feature;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Number_Feature_Engine {

    //Sonni naturallikka tekshiradi
    public static boolean isNatural(Double number){
        return number > 0 && number % 10 == 0;
    }




    //Berilgan sonni tub bo'luvchilarga ajratadi
    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    //Berilgan juda katta sonni tub bo'luvchilarga ajratadi
    public static ArrayList<BigInteger> primeFactorsPollardRho(String number){
        BigInteger bigInteger=new BigInteger(number);
        return PollardRho.factor(bigInteger);
    }

//
//    public static boolean isPrime(Integer number){
//        return number > 0 && number % 10 == 0;
//    }


    public static boolean isPrime(int number){
        int count=0;
        for (int i = 1; i <=number/2 ; i++) {
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

//    public static boolean isPrimeE(int n){
//        long[] a =new long[(int)n+1];
//        for(long i=0; i<n+1; i++)
//            a[(int)i]=i;
//        for(long p=2; p<n+1; p++) {
//            if(a[(int)p]!=0)
//            {
////                System.out.print(a[(int)p]+" ");
////                primes.add(a[(int)p]);
//                if (a[(int)p]==n)
//                    return true;
//                for(long j=p*p; j<n+1; j+=p)
//                    a[(int)j]=0;
//            }
//        }
//        return false;
//    }



    public static ArrayList<Integer> isPrimesSimple(int limit){
        ArrayList<Integer> primes=new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)){
                primes.add(i);
            }
        }

        return primes;
    }

    public static ArrayList<Integer> isPrimesSqrt(int limit){
        ArrayList<Integer> primes=new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrimeSqrt(i)){
                primes.add(i);
            }
        }

        return primes;
    }

    public static ArrayList<Long> isPrimesE(long n){
//        long a[]=new long[(int)n+1];
        ArrayList<Long> primes=new ArrayList<>();
//        for(int i=0; i<n+1; i++)
//            primes.add(i);
////            a[(int)i]=i;
//        for(int p=2; p<n+1; p++) {
//            if(primes.get(p)!=0)
//            {
////                System.out.print(a[(int)p]+" ");
//                for(int j=p*p; j<n+1; j+=p)
//                    primes.set(j,0);
////                    a[(int)j]=0;
//            }
//        }

        long[] a =new long[(int)n+1];
        for(long i=0; i<n+1; i++)
            a[(int)i]=i;
        for(long p=2; p<n+1; p++) {
            if(a[(int)p]!=0)
            {
//                System.out.print(a[(int)p]+" ");
                primes.add(a[(int)p]);
                for(long j=p*p; j<n+1; j+=p)
                    a[(int)j]=0;
            }
        }
        return primes;
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

    public static ArrayList<Integer> isPrimesFermat(int limit){
        ArrayList<Integer> primes=new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrimeFermat(i,1)){
                primes.add(i);
            }
        }

        return primes;
    }






//    // Kichkina tub sonlar uchun
//    public static ArrayList<Integer> SieveOfSundaram(int n) {
//        ArrayList<Integer> primes =new ArrayList<>();
//
//        // In general Sieve of Sundaram, produces
//        // primes smaller than (2*x + 2) for a number
//        // given number x. Since we want primes
//        // smaller than n, we reduce n to half
//        int nNew = (n - 1) / 2;
//
//        // This array is used to separate numbers of the
//        // form i+j+2ij from others where 1 <= i <= j
//        boolean marked[] = new boolean[nNew + 1];
//
//        // Initialize all elements as not marked
//        Arrays.fill(marked, false);
//
//        // Main logic of Sundaram. Mark all numbers of the
//        // form i + j + 2ij as true where 1 <= i <= j
//        for (int i = 1; i <= nNew; i++)
//            for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
//                marked[i + j + 2 * i * j] = true;
//
//        // Since 2 is a prime number
//        if (n > 2)
//            primes.add(2);
////            System.out.print(2 + " ");
//        // Print other primes. Remaining primes are of
//        // the form 2*i + 1 such that marked[i] is false.
//        for (int i = 1; i <= nNew; i++)
//            if (marked[i] == false)
//                primes.add(2*i+1);
////                System.out.print(2 * i + 1 + " ");
//        return primes;
//    }


    public static ArrayList<Integer> SieveOfAtkin(int limit) {
        ArrayList<Integer> primes=new ArrayList<>();
        // 2 and 3 are known to be prime
        if (limit > 2)
            primes.add(2);
//            System.out.print(2 + " ");

        if (limit > 3)
            primes.add(3);
//            System.out.print(3 + " ");

        // Initialise the sieve array with
        // false values
        boolean sieve[] = new boolean[limit];

        for (int i = 0; i < limit; i++)
            sieve[i] = false;

        /* Mark siev[n] is true if one of the
        following is true:
        a) n = (4*x*x)+(y*y) has odd number
           of solutions, i.e., there exist
           odd number of distinct pairs
           (x, y) that satisfy the equation
           and    n % 12 = 1 or n % 12 = 5.
        b) n = (3*x*x)+(y*y) has odd number
           of solutions and n % 12 = 7
        c) n = (3*x*x)-(y*y) has odd number
           of solutions, x > y and n % 12 = 11 */
        for (int x = 1; x * x < limit; x++) {
            for (int y = 1; y * y < limit; y++) {

                // Main part of Sieve of Atkin
                int n = (4 * x * x) + (y * y);
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))

                    sieve[n] ^= true;

                n = (3 * x * x) + (y * y);
                if (n <= limit && n % 12 == 7)
                    sieve[n] ^= true;

                n = (3 * x * x) - (y * y);
                if (x > y && n <= limit && n % 12 == 11)
                    sieve[n] ^= true;
            }
        }

        // Mark all multiples of squares as
        // non-prime
        for (int r = 5; r * r < limit; r++) {
            if (sieve[r]) {
                for (int i = r * r; i < limit;
                     i += r * r)
                    sieve[i] = false;
            }
        }

        // Print primes using sieve[]
        for (int a = 5; a < limit; a++)
            if (sieve[a])
                primes.add(a);
//                System.out.print(a + " ");
        return primes;
    }

}
