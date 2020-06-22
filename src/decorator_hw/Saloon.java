package decorator_hw;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine) {
		super(engine);
	}

	@Override
	public Engine getEngine() {
		return super.getEngine();
	}

	@Override
	public Vehicle.Colour getColour() {
		return super.getColour();
	}

	@Override
	public void paint(Vehicle.Colour colour) {
		super.paint(colour);
	}

	@Override
	public int getPrice() {
		return 6000;
	}
}
