package calculator.calculatior.actions;

import calculator.calculatior.Operation;

public class MultOperation implements Operation {
    @Override
    public double execute(double[] variables) {
        double mult = 1;
        for (double x : variables){
            mult *= x;
        }
        return mult;
    }
}
