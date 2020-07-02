package calculator.calculatior.actions;

import calculator.calculatior.Operation;

public class DivOperation implements Operation {
    @Override
    public double execute(double[] variables) {
        double div = variables[0];
        for (int i = 1; i < variables.length; i++){
            div /= variables[i];
        }
        return div;
    }
}
