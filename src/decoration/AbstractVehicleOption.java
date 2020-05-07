package decoration;

public abstract class AbstractVehicleOption extends AbstractVehicle {

	protected Vehicle v;

	public AbstractVehicleOption(Vehicle v) {
		super(v.getEngine(), v.getColour());
		this.v = v;
	}

	@Override
	public abstract int getPrice();

}
