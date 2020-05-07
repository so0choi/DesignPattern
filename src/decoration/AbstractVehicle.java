package decoration;

public abstract class AbstractVehicle implements Vehicle {
	private Engine engine;
	private Vehicle.Colour colour;

	public AbstractVehicle(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

	@Override
	public Vehicle.Colour getColour() {
		return colour;
	}

	@Override
	public void paint(Vehicle.Colour colour) { // color setter
		this.colour = colour;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + engine + ", " + colour + ", price " + getPrice() + ")";
	}

}
