package decoration;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

	public MetallicPaintedVehicle(Vehicle v) {
		super(v);
	}

	@Override
	public int getPrice() {

		return v.getPrice() + 750;
	}

}
