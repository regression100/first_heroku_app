package maths.pure.algebra.linear.vectors;

public final class Vector3d {

    /**
     * Boshi A(a1, a2, a3) nuqtada oxiri B(b1, b2, b3)
     * nuqtada bo'lgan AB vektorning koordinatalari.
     * Natijani 3 elementli massiv ko'rinishida qaytaradi.
     */
    public static double[] vektor3d_koordinatalari(double a1, double a2, double a3, double b1, double b2, double b3) {
        return new double[]{b1 - a1, b2 - a2, b3 - a3};
    }

    /**
     * a(x1, y1, z1) va b(x2, y2, z2) vektorlarni qo'shish.
     * Hosil bo'lgan yangi vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public static double[] vektor3d_qushish(double x1, double y1, double z1, double x2, double y2, double z2) {
        return new double[]{x1 + x2, y1 + y1, z1 + z2};
    }

    /**
     * a(x1, y1, z1) dan b(x2, y2, z2) vektorni qo'shish.
     * Hosil bo'lgan yangi vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public static double[] vektor3d_ayirish(double x1, double y1, double z1, double x2, double y2, double z2) {
        return new double[]{x1 - x2, y1 - y1, z1 - z2};
    }

    /**
     * Berilgan a(x1, y1, z1) vektorni t songa ko'paytirish.
     * Hosil bo'lgan vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public static double[] vektor3d_songa_kupaytirish(double t, double x1, double y1, double z1) {
        return new double[]{t * x1, t * y1, t * z1};
    }

    /**
     * Berilgan a(x1, y1, z1) vektorning uzunligi.
     * Natijani double ko'rinishida qaytaradi.
     */
    public static double vektor3d_uzunlik(double x1, double y1, double z1) {
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }

    /**
     * a(x1, y1, z1) va b(x2, y2, z2) vektorlarning skalyar
     * ko'paytmasi, ya'ni   a*b.
     * Natijani double ko'rinishida qaytaradi.
     */
    public static double vektor3d_skalyar_kupaytma(double x1, double y1, double z1, double x2, double y2, double z2) {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    /**
     * Agar a va b vektorlarning uzunligi va ular orasidagi burchak
     * ma'lum bo'lsa ularning skalyar ko'paytmasi.
     * Natija double qaytariladi.
     * burchak radian da berilishi lozim.
     */
    public static double vektor3d_skalyar_burchak_orqali(double a, double b, double burchak) {
        return a * b * Math.cos(burchak);
    }

    /**
     * a(x1, y1, z1) va b(x2, y2, z2) vektorlar orasidagi
     * burchak kosinusini hisoblash.
     * Natija cos(alfa) ning qiymati bo'ladi va double qaytariladi.
     */
    public static double vektor3d_orasidagi_burchak_cos(double x1, double y1, double z1, double x2, double y2, double z2) {
        return (x1 * x2 + y1 * y2 + z1 * z2) /
                (Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2) * Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1));
    }

    /**
     * "NOL" ga teng bo'lmagan a(x1, y1, z1) va b(x2, y2, z2)
     * vektorlarning perpendikulyarlik sharti.
     * Natija boolean qaytariladi.
     */
    public static boolean vektor3d_is_perpendikulyar(double x1, double y1, double z1, double x2, double y2, double z2) {
        return x1 * x2 + y1 * y2 + z1 * z2 == 0;
    }

    /**
     * "NOL" ga teng bo'lmagan a(x1, y1, z1) va b(x2, y2, z2)
     * vektorlarning kollinearlik sharti.
     * Natija boolean qaytariladi.
     */
    public static boolean vektor3d_is_kolleniar(double x1, double y1, double z1, double x2, double y2, double z2) {
        return (x2 / x1) == (y2 / y1) && (x2 / x1) == (z2 / z1);
    }

    /**
     * Uchlari A(x1, y1, z1), B(x2, y2, z2), C(x3, y3, z3)
     * nuqtalarda yotgan uchburchak medianalri kesishgan nuqta
     * koordinatalari.
     * Kesishish nuqtasi koordinatalri 3 elementli massiv ko'rinishida
     * qaytariladi.
     */
    public static double[] vektor3d_mediana_kesishmasi(
            double x1, double y1, double z1,
            double x2, double y2, double z2,
            double x3, double y3, double z3
    ) {
        return new double[]{(x1 + x2 + x3) / 3, (y1 + y2 + y3) / 3, (z1 + z2 + z3) / 3};
    }
}
