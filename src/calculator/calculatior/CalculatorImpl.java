package calculator.calculatior;

public class CalculatorImpl implements Calculator{

	private OperationResolver resolver;

	public CalculatorImpl(OperationResolver resolver) {
		this.resolver = resolver;
	}

	@Override
	public double calculate(String operation, double... variables) {
		Operation op = resolver.resolve(operation);
		return op.execute(variables);
	}
}
