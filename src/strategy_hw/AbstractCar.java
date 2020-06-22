package strategy_hw;

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

	public void setGearboxStrategy(GearboxStrategy gs) {
		this.gearboxStrategy = gs;
	}

	public GearboxStrategy getGearboxStrategy() {
		return this.gearboxStrategy;
	}

	public void setSpeed(int speed) {
		gearboxStrategy.ensureCorrectGear(this.getEngine(), speed);
	}

}
