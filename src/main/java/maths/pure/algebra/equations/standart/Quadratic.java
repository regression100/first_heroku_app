package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.QuadraticModel;
import maths.pure.algebra.equations.standart.model.RootQ;

public interface Quadratic {
     static QuadraticModel sQED(double a, double b, double c){
        if (a==0){
            return null;
        }
        else {
            return new QuadraticModel(a,b,c);
        }
    }
}
