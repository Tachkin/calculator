package calculator;

import java.util.Scanner;

public class Calculator {
	
	private double x, y, result;
	private String operation, expression;
	private boolean exit = false;
	
	public void start() {
		
		System.out.println("������� ��������� � ������� \"x + y\", 0 - ��� ������:");
		
		try(Scanner exprScanner = new Scanner(System.in)) {
			
			expression = exprScanner.nextLine();
			
			if(expression.equals("0")) {
				exit = true;
				System.out.println("����� �� ���������");
			}
			else {
				
				try(Scanner scanner = new Scanner(expression)) {
					
					x = scanner.nextDouble();
					operation = scanner.next();
					y = scanner.nextDouble();
					
					result = calculate(x, y, operation);
					
					System.out.printf("���������: %,.2f \n", result);
					
				} catch (Exception e) {
					System.out.println("�������� ���������, ����� �� ���������");
					exit = true;
				}
				
				
			}
			
			while(!exit) {
				
				System.out.println("������� ��������� �������� � ������� \"+ z\", 0 - ��� ������:");
				
				expression = exprScanner.nextLine();
				
				if(expression.equals("0")) {
					exit = true;
					System.out.println("����� �� ���������");
				}
				else {
					
					try(Scanner scanner = new Scanner(expression)) {
						
						operation = scanner.next();
						y = scanner.nextDouble();
						
						result = calculate(result, y, operation);
						
						System.out.printf("���������: %,.2f \n", result);
						
					} catch (Exception e) {
						System.out.println("�������� ���������, ����� �� ���������");
						exit = true;
					}
				}
			}
		}
	}
	
	public double calculate(double x, double y, String operation) {
		switch(operation) {
			case "+": 
				result = x + y;
				break;
			case "-": 
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				result = x / y;
		}
		return result;
	}
	
}
