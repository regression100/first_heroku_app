package commons;

import java.util.ArrayList;

// TASODIFIY SONLAR MOTORI
public final class RandomEngine {


    // Bitta tasodifiy natural son qaytaradigan metod
    public static Integer random(Integer chegara){
        return ((int) (Math.random() * chegara) +1);
    }


    /* Bitta tasodifiy butun son qaytaradigan metod
     * Agar "boolean natural" o'zgaruvchi rost bo'lsa natural, yolg'on bo'lsa kasr son qaytaradi*/
    public static double random(Double chegara){
            return ((Math.random() * chegara) +1);
    }


    // Berilga a va b oraliqdagi tasodifiy natural son qaytaradigan metod
    public static Integer randomInterval(Integer a, Integer b){
        if (a<b){
            return random(b-a)+(a-1);
        } else {
            if (a>b){
                return random(a-b)+(b-1);
            }
            else {
                return 0;
            }
        }
    }

    // Berilga a va b oraliqdagi tasodifiy butun son qaytaradigan metod
    public static double randomIntervalFloat(double a, double b){
        if (a<b){
            return random(b-a)+(a-1);
        } else {
            if (a>b){
                return random(a-b)+(b-1);
            }
            else {
                return 0;
            }
        }
    }



    // Bir nechta tasodifiy natural son qaytaradigan metod.
    public static ArrayList<Integer> randomMulti(Integer chegara, Integer soni){
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i <soni ; i++) {
            randoms.add(random(chegara));
        }
        return randoms;
    }


    /* Bir nechta tasodifiy butun son qaytaradigan metod
     * Agar "boolean natural" o'zgaruvchi rost bo'lsa natural, yolg'on bo'lsa kasr son qaytaradi*/
    public static ArrayList<Double> randomMulti(Double chegara, Integer soni){
        ArrayList<Double> randoms = new ArrayList<>();

            for (int i = 0; i <soni ; i++) {
                randoms.add(random(chegara));
            }
            return randoms;


    }


    // Bir nechta tasodifiy takrorlanmaydigan natural son qaytaradigan metod, bunda soni<=chegara bo'lishi kerak, aks holda null qaytaradi
    public static ArrayList<Integer> randomMultiTakrorlanmasin(Integer chegara, Integer soni) {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        int tempRandom;
        if (soni <= chegara) {


            for (int i = 0; i < soni; i++) {
                boolean bool = true;
                tempRandom = random(chegara);
                while (bool) {
                    if (randoms.contains(tempRandom)) {
                        tempRandom = random(chegara);
                    } else {
                        randoms.add(tempRandom);
                        bool = false;
                    }


                }


            }


            return randoms;
        }
        return null;
    }


    /* Bir nechta tasodifiy takrorlanmaydigan butun son qaytaradigan metod, bunda soni<=chegara bo'lishi kerak, aks holda null qaytaradi
     * Agar "boolean natural" o'zgaruvchi rost bo'lsa natural, yolg'on bo'lsa kasr son qaytaradi*/
    public static ArrayList<Double> randomMultiTakrorlanmasin(Double chegara, Integer soni) {

        ArrayList<Double> randoms = new ArrayList<>();

        double tempRandom;


            if (soni <= chegara) {


                for (int i = 0; i < soni; i++) {
                    boolean bool = true;
                    tempRandom = random(chegara);
                    while (bool) {
                        if (randoms.contains(tempRandom)) {
                            tempRandom = random(chegara);
                        } else {
                            randoms.add(tempRandom);
                            bool = false;
                        }


                    }


                }


                return randoms;
            }
            return null;

    }
}
