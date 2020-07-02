package calculator;

import calculator.calculatior.Calculator;

public class CalculatorApp {

    private Calculator calc;
    private ExpressionHandler exprHandler;
    private ExpressionReader exprReader;

    CalculatorApp(Calculator calc, ExpressionReader exprReader, ExpressionHandler exprHandler) {
        this.calc = calc;
        this.exprReader = exprReader;
        this.exprHandler = exprHandler;
    }

    public void start() {

        boolean exit = false;
        while (!exit) {

            System.out.println("Введите выражение в формате \"+ x y z....\", 0 - для выхода:");

            String expression = exprReader.read();

            if (expression.equals("0")) {
                exit = true;
                System.out.println("Выход из программы...");
            } else {
                exprHandler.process(expression);
                double result = calc.calculate(exprHandler.getOperation(), exprHandler.getArguments());
                System.out.printf("Результат: %,.2f \n", result);
            }
        }
    }
}
