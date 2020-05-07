package decoration;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

	public LeatherSeatedVehicle(Vehicle v) {
		super(v);
	}

	@Override
	public int getPrice() {

		return v.getPrice() + 1200;
	}

}