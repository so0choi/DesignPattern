package decorator_hw;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
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

}
