package calculator.calculatior.actions;

import calculator.calculatior.Operation;

public class SummOperation implements Operation {
    @Override
    public double execute(double[] variables) {
        double summ = 0;
        for (double x : variables){
            summ += x;
        }
        return summ;
    }
}
