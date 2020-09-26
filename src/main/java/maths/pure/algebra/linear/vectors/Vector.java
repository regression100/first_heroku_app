package maths.pure.algebra.linear.vectors;

/**
 * Katta harflar bilan nuqtalar beriladi, kichik harflar bilan esa vektorlar
 * beriladi.
 * Qavslar ichidagi x va y (yoki a va b) koordinatalar bundan mustasno.
 */

public final class Vector {

    /**
     * Boshi A(a1; a2) nuqtada oxiri B(b1; b2) nuqtada bo'lgan
     * AB = a vektorning koordinatalari.
     * Natijani ikki o'lchamli massiv ko'rinishida qaytaradi.
     */
    public static double[] vektor_koordinatlari(double a1, double a2, double b1, double b2) {
        return new double[]{b2 - a2, b1 - a1};
    }

    /**
     * a(x1; y1) dan b(x2, y2) vektorni ayirish. Ya'ni c = a - b;
     * Yangi hosil bo'lgan c vektor koordinatalarini ikki o'lchovli
     * massiv ko'rinishida qaytaradi.
     */
    public static double[] ayirmasi(double x1, double y1, double x2, double y2) {
        return new double[]{x1 - x2, y1 - y2};
    }

    /**
     * Berilgan a(x1, y1) vektorni t songa ko'paytirish.
     * Natijani ikki o'lchamli massiv ko'rinishida qaytaradi.
     */
    public static double[] songa_kupaytmasi(double x1, double y1, double t) {
        return new double[]{x1 * t, y1 * t};
    }

    /**
     * Berilgan a(x1, y1) vektorning uzunligi.
     * Natijani musbat double qiymatda qaytaradi.
     */
    public static double vektor_uzunligi(double x1, double y1) {
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    /**
     * a(x1; y1) va b(x2; y2) vektorlarning skalyar ko'paytmasi.
     * Natijani double qiymatda qaytaradi.
     */
    public static double skalyar_kupaytma(double x1, double y1, double x2, double y2) {
        return x1 * x2 + y1 * y2;
    }

    /**
     * Agar berilgan a va b vektorlarning uzunliklari va ular orasidagi
     * burchak aniq bo'lsa ularning skalyar ko'paytmasini topish.
     * Burchak radian da berilishi kerak.
     * Natijani double qiymatda qaytaradi.
     */
    public static double skalyar_kupaytma_burchak_orqali(double a, double b, double burchak) {
        return a * b * Math.cos(burchak);
    }

    /**
     * Nol ga teng bo'lmagan ikki vektorning perpendikulyarligini tekshirish.
     * Natijani boolean qaytaradi.
     */
    public static boolean perpendikulyarlik_sharti(double x1, double y1, double x2, double y2) {
        return skalyar_kupaytma(x1, y1, x2, y2) == 0;
    }

    public static boolean perpendikulyarlik_sharti(double a, double b, double burchak) {
        return skalyar_kupaytma_burchak_orqali(a, b, burchak) == 0;
    }

    /**
     * a(x1; y1) va b(x2; y2) vektorlar orasidagi burchak kosinusini hisoblash.
     * Natijani double qiymatda qaytaradi. Ushbu qiymat cos ning qiymati,
     * burchakning radian dagi qiymati emas.
     */
    public static double vektorlar_orasidagi_burchak_cos(double x1, double y1, double x2, double y2) {
        return (x1 * x2 + y1 * y2) / (Math.sqrt(x2 * x2 + y2 * y2) * Math.sqrt(x1 * x1 + y1 * y2));
    }

    /**
     * Agar vektorlarning skalyar ko'paytmasi ab va ularning a va b uzunliklari
     * ma'lum bo'lsa, ushbu vektorlar orasidagi burchak kosinusini hisoblash.
     * Natijani double qaytaradi.
     */
    public static double cos_vektorlar_orasi(double ab, double a, double b) {
        return ab / (a * b);
    }

    /**
     * a(x1; y1) va b(x2; y2) vektorlarning kollinearlik sharti.
     * Boolean qaytaradi.
     */
    public static boolean is_kollinear(double x1, double y1, double x2, double y2) {
        return (x2 / x1) == (y2 / y1);
    }
}
