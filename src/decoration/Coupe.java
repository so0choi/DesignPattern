package decoration;

public class Coupe extends AbstractCar {
	Coupe(Engine e) {
		super(e);
	}

	@Override
	public int getPrice() {
		return 7000;
	}

}
