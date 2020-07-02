package calculator.calculatior;

import calculator.calculatior.actions.DivOperation;
import calculator.calculatior.actions.MultOperation;
import calculator.calculatior.actions.SubOperation;
import calculator.calculatior.actions.SummOperation;

public class OperationResolverImpl implements OperationResolver {

    private Operation summOperation = new SummOperation();
    private Operation subOperation = new SubOperation();
    private Operation multOperation = new MultOperation();
    private Operation divOperation = new DivOperation();

    @Override
    public Operation resolve(String operationName) {
        Operation operation = null;
        switch (operationName) {
            case "+":
                operation = summOperation;
                break;
            case "-":
                operation = subOperation;
                break;
            case "*":
                operation = multOperation;
                break;
            case "/":
                operation = divOperation;
        }
        return operation;
    }
}
