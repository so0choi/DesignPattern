package decoratorpattern;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (getSize() == Beverage.Size.TALL) {
			cost += .10;
		} else if (getSize() == Beverage.Size.GRANDE) {
			cost += .20;
		} else {
			cost += .30;
		}
		return cost;
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

}
