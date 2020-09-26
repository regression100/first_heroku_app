package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.QuadraticModel;
import maths.pure.algebra.equations.standart.model.RootQ;

public final class SEQEngine implements Linear, Quadratic{
    public static QuadraticModel sQED(double a, double b, double c){
        return Quadratic.sQED(a,b,c);
    }

    public static Double sLE(double a, double b){
        return Linear.sLE(a,b);
    }

//    public static RootC sCEC(double a, double b, double c, double d){
//        return Cubic.sCEC(a,b,c,d);
//    }
}
