package decorator_hw;

public abstract class AbstractVehicle implements Vehicle {
	private Engine engine;
	private Vehicle.Colour colour;

	public AbstractVehicle() {
	}

	public AbstractVehicle(Engine engine) {
		this.engine = engine;
		this.colour = Vehicle.Colour.UNPAINTED;
	}

	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	@Override
	public Engine getEngine() {
		return this.engine;
	}

	@Override
	public Vehicle.Colour getColour() {
		return this.colour;
	}

	@Override
	public void paint(Vehicle.Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + engine.toString() + ", " + colour + ", price " + getPrice() + ")";
	}
}
