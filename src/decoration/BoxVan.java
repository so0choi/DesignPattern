package decoration;

public class BoxVan extends AbstractVan {
	BoxVan(Engine e) {
		super(e);
	}

	@Override
	public int getPrice() {
		return 10000;
	}
}
