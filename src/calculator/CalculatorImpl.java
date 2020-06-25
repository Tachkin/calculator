package calculator;

public class CalculatorImpl implements Calculator{
	
	@Override
	public double plus(double x, double y) {
		return x + y;
	}
	
	@Override
	public double minus(double x, double y) {
		return x - y;
	}
	
	@Override
	public double mult(double x, double y) {
		return x * y;
	}

	@Override
	public double div(double x, double y) {
		return x / y;
	}
	
}
