package calculator;

public class Application {

	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		ExpressionReader exprReader = new Expression();
		ExpressionHandler exprHandler = new Expression();
		CalculatorApp calcApp = new CalculatorApp(calc, exprReader, exprHandler);
		
		calcApp.start();
		
	}
}