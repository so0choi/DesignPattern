package decoration;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine) {
		super(engine);
	}

	@Override
	public int getPrice() {
		return 6000;
	}
}
