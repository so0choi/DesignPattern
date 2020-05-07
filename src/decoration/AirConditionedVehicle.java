package decoration;

public class AirConditionedVehicle extends AbstractVehicleOption {

	private int temperature;

	public AirConditionedVehicle(Vehicle v) {
		super(v);
	}

	@Override
	public int getPrice() {
		return v.getPrice() + 600;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

}
