package maths.pure.algebra.equations.standart.model;

import lombok.Data;

@Data
public class RootC {

//    private double a;
//    private double b;
//    private double c;
//    private double d;

    private double p;
    private double q;

    private double u;
    private double v;
    private double r;

    private Double x1;
    private Double x2;
    private Double x3;
    public RootC(double a, double b, double c, double d) {

//        p=(c/a)-((b*b)/(3*a*a));
//        q=((2*b*b)/(27*a*a*a))-((b*c)/(3*a*a))+d/a;
//        u=Math.pow(((-q+Math.sqrt(q*q+(4*p*p*p)/27)))/2,1/3);
//        v=Math.pow(((-q-Math.sqrt(q*q+(4*p*p*p)/27)))/2,1/3);
//        x1=u-v-(b/3*a);
        p = -b/(3*a);
        q = p*p*p + (b*c-3*a*d)/(6*a*a*a);
        r = c/(3*a);

        x1   =   Math.pow((Math.sqrt(q + (q*q + Math.pow(r-p*p,3)))),1/3)  +  Math.pow((Math.sqrt(q - (q*q + Math.pow(r-p*p,3)))),1/3)   +   p;

    }
}
