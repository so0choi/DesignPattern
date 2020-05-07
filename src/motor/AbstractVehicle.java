package motor;

public abstract class AbstractVehicle implements Vehicle {
	private Engine engine;
	private Vehicle.Colour coulour;

	public AbstractVehicle(Engine engine) {
		this.engine = engine;
	}

	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.coulour = colour;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

	public Vehicle.Colour getCoulour() {
		return coulour;
	}

	@Override
	public void paint(Vehicle.Colour coulour) { // color setter
		this.coulour = coulour;
	}

}
