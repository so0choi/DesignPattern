package decoratorpattern;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

}
