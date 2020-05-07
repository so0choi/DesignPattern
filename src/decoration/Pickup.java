package decoration;

public class Pickup extends AbstractVan {
	Pickup(Engine e) {
		super(e);
	}

	@Override
	public int getPrice() {
		return 9000;
	}
}
