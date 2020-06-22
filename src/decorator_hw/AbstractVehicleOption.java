package decorator_hw;

public abstract class AbstractVehicleOption extends AbstractVehicle {
	Vehicle decoratedVehicle;

	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColour());
		decoratedVehicle = vehicle;
	}

	@Override
	public abstract int getPrice();
}
