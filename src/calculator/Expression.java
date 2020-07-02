package calculator;

import java.util.Scanner;

public class Expression implements ExpressionReader, ExpressionHandler{
	
	private String operation;
	private double[] arguments;
	private Scanner scanner;

	public Expression(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public String read() {
		return scanner.nextLine();
	}

	@Override
	public String[] process(String expression) {

		String[] exprArray = expression.trim().split(" ");
		operation = exprArray[0];
		arguments = new double[exprArray.length-1];
		for (int i = 1; i < exprArray.length; i++) {
			arguments[i-1] = Double.parseDouble(exprArray[i]);
		}
		return exprArray;

	}

	public String getOperation() {
		return operation;
	}

	public double[] getArguments() {
		return arguments;
	}
}
