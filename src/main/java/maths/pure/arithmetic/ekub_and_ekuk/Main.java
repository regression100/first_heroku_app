package maths.pure.arithmetic.ekub_and_ekuk;

import commons.RandomEngine;
import maths.pure.arithmetic.number_feature.primality.Primality;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long startTime;
//                List<Integer> list=new ArrayList<>();
//                list.add(20);
//                list.add(30);
//                list.add(40);
//                list.add(50);
//                list.add(60);
//                System.out.println( "Ikki sonning ekubi Evklitda  "+Ekub_Ekuk_Engine.ekubEvklit(12,20));
//                System.out.println("Ikki sonning ekuki Evklitda  "+Ekub_Ekuk_Engine.ekukEvklit(12,20));
//                System.out.println("Ikki sonning ekubi Shteynda  "+Ekub_Ekuk_Engine.gcdEkub(12,20));
//                System.out.println("Ikki sonning ekuki Shteynda  "+Ekub_Ekuk_Engine.gcdEkuk(12,20));
//                System.out.println( "Ikkitadan ortiq sonning ekubi Evklitda  "+Ekub_Ekuk_Engine.multiEkubEvlit(list));
//                System.out.println( "Ikkitadan ortiq sonning ekuki Evklitda  "+Ekub_Ekuk_Engine.multiEkukEvklit(list));
//                System.out.println( "Ikkitadan ortiq sonning ekubi Shteynda  "+Ekub_Ekuk_Engine.gcdMultiEkub(list));
//                System.out.println( "Ikkitadan ortiq sonning ekuki Shteynda  "+Ekub_Ekuk_Engine.gcdMultiEkuk(list));
//
        ArrayList<Integer> randoms=RandomEngine.randomMulti(150,50000);
//        ArrayList<Integer> randoms2=RandomEngine.randomMulti(15,10);
        System.out.println(randoms);
//        System.out.println(randoms2);



        startTime = System.nanoTime();
        System.out.println(Ekub_Ekuk_Engine.multiEkubEvlit(randoms));
        System.out.println(Ekub_Ekuk_Engine.multiEkubEvlit(randoms));
        System.out.println(Ekub_Ekuk_Engine.multiEkubEvlit(randoms));
        System.out.println(Ekub_Ekuk_Engine.multiEkubEvlit(randoms));
//        System.out.println(Ekub_Ekuk_Engine.multiEkukEvklit(randoms2));
        System.out.printf("multiEkubEvlit: %d ms%n", (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(Ekub_Ekuk_Engine.gcdMultiEkub(randoms));
        System.out.println(Ekub_Ekuk_Engine.gcdMultiEkub(randoms));
        System.out.println(Ekub_Ekuk_Engine.gcdMultiEkub(randoms));
        System.out.println(Ekub_Ekuk_Engine.gcdMultiEkub(randoms));
//        System.out.println(Ekub_Ekuk_Engine.gcdMultiEkuk(randoms2));
        System.out.printf("gcdMultiEkub: %d ms%n", (System.nanoTime() - startTime) / 1000000);



    }
}
