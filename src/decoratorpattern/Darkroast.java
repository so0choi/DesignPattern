package decoratorpattern;

public class Darkroast extends Beverage {
	public Darkroast() {
		description = "다크로스트";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
