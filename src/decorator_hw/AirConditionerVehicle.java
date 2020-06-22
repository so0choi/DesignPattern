package decorator_hw;

public class AirConditionerVehicle extends AbstractVehicleOption {
	public AirConditionerVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	int temperature;

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 660;
	}

	public void setTemperature(int t) {
		this.temperature = t;
	}

}
