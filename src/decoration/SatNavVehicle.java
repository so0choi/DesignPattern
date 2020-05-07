package decoration;

public class SatNavVehicle extends AbstractVehicleOption {
	private String destination;

	public SatNavVehicle(Vehicle v) {
		super(v);
	}

	@Override
	public int getPrice() {
		return v.getPrice() + 1500;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
