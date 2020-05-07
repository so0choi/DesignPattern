package motor;

public abstract class AbstractCar extends AbstractVehicle {
	private GearboxStrategy gearboxStrategy;

	public AbstractCar(Engine engine) {
		super(engine);
		this.gearboxStrategy = new StandardGearboxStrategy();
	}

	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
		this.gearboxStrategy = new StandardGearboxStrategy();
	}

	public GearboxStrategy getGearboxStrategy() {
		return gearboxStrategy;
	}

	public void setGearboxStrategy(GearboxStrategy gearboxStrategy) {
		this.gearboxStrategy = gearboxStrategy;
	}

	public void setSpeed(int speed) {
		gearboxStrategy.ensureCorrectGear(getEngine(), speed);
	}

}
