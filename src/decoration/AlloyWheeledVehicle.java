package decoration;

public class AlloyWheeledVehicle extends AbstractVehicleOption {

	AlloyWheeledVehicle(Vehicle v) {
		super(v);
	}

	@Override
	public int getPrice() {

		return v.getPrice() + 250;
	}

}
