package maths.pure.arithmetic.number_feature;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Number_Feature_Engine.isNatural(0d));

        long startTime;

//        startTime = System.nanoTime();
//
//        System.out.println(Number_Feature_Engine.primeFactors(387420489));
//        System.out.println(Number_Feature_Engine.primeFactors(387420489));
//
//        System.out.printf("Simple: %d ms%n", (System.nanoTime() - startTime) / 1000000);
//
//
//
//        startTime = System.nanoTime();
//        System.out.println(Number_Feature_Engine.primeFactorsPollardRho("387420489"));
//        System.out.println(Number_Feature_Engine.primeFactorsPollardRho("387420489"));
//
//        System.out.printf("PollardRho: %d ms%n", (System.nanoTime() - startTime) / 1000000);
//
//
//        System.out.println(Number_Feature_Engine.isPrime(9));





        startTime = System.nanoTime();
        System.out.println(Number_Feature_Engine.isPrimesSimple(50000));
        System.out.printf("isPrimesSimple: %d ms%n", (System.nanoTime() - startTime) / 1000000);


        startTime = System.nanoTime();
        System.out.println();
//        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
        System.out.println(Number_Feature_Engine.isPrimesE(500000));
        System.out.printf("isPrimesE: %d ms%n", (System.nanoTime() - startTime) / 1000000);


        startTime = System.nanoTime();
        System.out.println();
//        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
        System.out.println(Number_Feature_Engine.isPrimesSqrt(500000));
        System.out.printf("isPrimesSqrt: %d ms%n", (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println();
//        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
        System.out.println(Number_Feature_Engine.isPrimesFermat(500000));
        System.out.printf("isPrimesFermat: %d ms%n", (System.nanoTime() - startTime) / 1000000);

//        startTime = System.nanoTime();
//        System.out.println();
////        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
//        System.out.println(Number_Feature_Engine.SieveOfSundaram(50000));
//        System.out.printf("isPrimesSundaram: %d ms%n", (System.nanoTime() - startTime) / 1000000);



        startTime = System.nanoTime();
        System.out.println();
//        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
        System.out.println(Number_Feature_Engine.SieveOfAtkin(219169));
        System.out.printf("isPrimesAtkin: %d ms%n", (System.nanoTime() - startTime) / 1000000);

    }
}
