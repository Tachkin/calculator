package calculator;

import java.util.Scanner;

public class CalculatorApp {
	
	private Calculator calc;
	private ExpressionReader exprReader;
	private ExpressionHandler exprHandler;
	private String expression, operation;
	private String[] exprArray;
	private double x, y, result;
	private boolean exit = false;
	
	CalculatorApp(Calculator calc, ExpressionReader exprReader, ExpressionHandler exprHandler) {
		this.calc = calc;
		this.exprReader = exprReader;
		this.exprHandler = exprHandler;
	}
	
	public void start() {
		
		try(Scanner scanner = new Scanner(System.in)) {
		
			while(!exit) {
				
				System.out.println("Введите выражение в формате \"x + y\", 0 - для выхода:");
				
				expression = exprReader.read(scanner);
				
				if(expression.equals("0")) {
					exit = true;
					System.out.println("Выход из программы...");
				}
				else  {
					
					exprArray = exprHandler.process(expression);
					
					x = Double.parseDouble(exprArray[0]);
					y = Double.parseDouble(exprArray[2]);
					operation = exprArray[1];
					
					switch(operation) {
					case "+": result = calc.plus(x, y); break;
					case "-": result = calc.minus(x, y); break;
					case "*": result = calc.mult(x, y); break;
					case "/": result = calc.div(x, y);
					}
					
					System.out.printf("Результат: %,.2f \n", result);
				}
			}
		}
	}
}
