package decorator_hw;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1200;
	}
}
