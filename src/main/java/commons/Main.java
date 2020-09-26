package commons;

import maths.pure.algebra.linear.matrix.Matrix;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(RandomEngine.qaytar(5,6));
//            System.out.println(RandomEngine.randomInterval(10, 15));
        double[][] a=new double[2][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
//        a[2][0]=5;
//        a[2][1]=6;
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(Matrix.transposeMatrix(a)));
        System.out.println(Arrays.deepToString(Matrix.multiplyMatrix(Matrix.transposeMatrix(a),a)));
        System.out.println();
            //        }
    }
}
