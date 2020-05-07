package decoration;

public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine) {
		super(engine);

	}

	public AbstractVan(Engine engine, Colour c) {
		super(engine, c);
	}

}
