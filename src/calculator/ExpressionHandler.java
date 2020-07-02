package calculator;

public interface ExpressionHandler {
	
	String[] process(String expression);

	String getOperation();

	double[] getArguments();

}
