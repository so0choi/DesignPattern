package decoratorpattern;

public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();

	@Override
	public abstract Size getSize();

}
