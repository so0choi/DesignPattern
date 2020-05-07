package decoration;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		super(engine);
	}

	public AbstractCar(Engine engine, Colour c) {
		super(engine, c);
	}

}
