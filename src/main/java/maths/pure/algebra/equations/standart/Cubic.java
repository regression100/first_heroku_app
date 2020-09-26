package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.RootC;

public interface Cubic {

    static RootC sCEC(double a, double b, double c, double d){


        return new RootC(a,b,c,d);
    }

}
