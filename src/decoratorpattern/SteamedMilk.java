package decoratorpattern;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamedMilk(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", SteamedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

}
