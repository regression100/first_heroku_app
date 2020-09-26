package maths.pure.algebra.equations.standart.model;

import lombok.Data;

@Data
public class RootQ {
    private double D;
    private Double x1;
    private Double x2;

    public RootQ(double a, double b, double c) {
        D = b*b-4*a*c;
        if (D<0){
            x1=null;
            x2=null;
        }
        else {
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
        }
    }
}
