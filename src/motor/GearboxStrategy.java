package motor;

public interface GearboxStrategy {
	public void ensureCorrectGear(Engine engine, int speed);
}
