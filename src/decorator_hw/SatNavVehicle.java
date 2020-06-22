package decorator_hw;

public class SatNavVehicle extends AbstractVehicleOption {

	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1500;
	}
}
