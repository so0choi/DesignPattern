package decoratorpattern;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

	@Override
	public Size getSize() {
		return beverage.beverageSize;
	}

}
