package decorator_hw;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 750;
	}
}
