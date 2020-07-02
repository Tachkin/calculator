package calculator;

import calculator.calculatior.Calculator;
import calculator.calculatior.CalculatorImpl;
import calculator.calculatior.OperationResolverImpl;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl(new OperationResolverImpl());
		Expression expr = new Expression(new Scanner(System.in));
		CalculatorApp calcApp = new CalculatorApp(calc, expr, expr);
		
		calcApp.start();
		
	}
}