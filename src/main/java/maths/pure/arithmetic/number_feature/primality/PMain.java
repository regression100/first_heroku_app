package maths.pure.arithmetic.number_feature.primality;

import maths.pure.arithmetic.number_feature.Number_Feature_Engine;

public class PMain {
    public static void main(String[] args) {
        long startTime;

        startTime = System.nanoTime();
        System.out.println(Primality.isPrimeFermat(99999991,1));
        System.out.printf("isPrimeFermat: %d ms%n", (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(Primality.isPrime(99999991));
        System.out.printf("isPrimesSimple: %d ms%n", (System.nanoTime() - startTime) / 1000000);


        startTime = System.nanoTime();
//        System.out.println(Number_Feature_Engine.isPrimesSimpleByMethod(100000));
        System.out.println(Primality.isPrimeSqrt(999999991));
        System.out.printf("isPrimeSqrt: %d ms%n", (System.nanoTime() - startTime) / 1000000);


        startTime = System.nanoTime();
        System.out.println(Primality.isPrimeLucasLehmer(99999991));
        System.out.printf("isPrimesSimple: %d ms%n", (System.nanoTime() - startTime) / 1000000);


    }
}
