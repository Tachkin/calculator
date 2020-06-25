package calculator;

import java.util.Scanner;

public class Expression implements ExpressionReader, ExpressionHandler{
	
	private String expression;
	private String[] exprArray;
	
	@Override
	public String read(Scanner scanner) {
		
		expression = scanner.nextLine();
		
		return expression;
		
	}
	
	@Override
	public String[] process(String expression) {
		
		try(Scanner scanner = new Scanner(expression)) {
			
			exprArray = new String[3];
			
			for(int i = 0; i < exprArray.length; i++) 
				exprArray[i] = scanner.next();
			
		} catch(Exception e) {
			System.out.println("Неверное выражение...");
		}
		
		return exprArray;
		
	}
	
}
