package maths.pure.algebra.equations.standart;

public interface Linear {
     static double sLE(double a, double b){
        if (a!=0){
            return -(b/a);
        }
        else return 0;
    }
}
