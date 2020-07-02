package calculator.calculatior.actions;

import calculator.calculatior.Operation;

public class SubOperation implements Operation {
    @Override
    public double execute(double[] variables) {
        double sub = variables[0];
        for (int i = 1; i < variables.length; i++){
            sub -= variables[i];
        }
        return sub;
    }
}
