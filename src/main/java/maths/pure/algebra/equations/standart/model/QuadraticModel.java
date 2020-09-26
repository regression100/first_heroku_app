package maths.pure.algebra.equations.standart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuadraticModel {
    private double a;
    private double b;
    private double c;
    private double D;
    private double X1;
    private double X2;

    public QuadraticModel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        RootQ rootQ=new RootQ(a,b,c);
        this.D=rootQ.getD();
        this.X1=rootQ.getX1();
        this.X2=rootQ.getX2();
    }
}
