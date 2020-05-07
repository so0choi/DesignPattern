package decoration;

public class Sport extends AbstractCar {
	Sport(Engine e) {
		super(e);
	}

	@Override
	public int getPrice() {
		return 8000;
	}
}
