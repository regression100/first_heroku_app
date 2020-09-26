package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.QuadraticModel;
import maths.pure.algebra.equations.standart.model.RootQ;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) throws ScriptException {
        QuadraticModel quadraticModel;
        System.out.println(SEQEngine.sLE(5,-10));
        quadraticModel =SEQEngine.sQED(1,-4,4);
//        System.out.println(SEQEngine.sCEC(1,1,1,-3));
        System.out.println(quadraticModel);
        System.out.println(quadraticModel.getX1());
        System.out.println(quadraticModel.getX2());
//        System.out.println(22445^6);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval("3+3*2");
        System.out.println(result);
    }
}
