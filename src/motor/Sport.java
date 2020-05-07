package motor;

public class Sport extends AbstractCar {

	public Sport(Engine engine) {
		super(engine);
	};

	public Sport(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

	@Override
	public Colour getColour() {
		return super.getCoulour();
	}

}
