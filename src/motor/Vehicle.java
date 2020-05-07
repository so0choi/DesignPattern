package motor;

public interface Vehicle {
	public enum Colour {
		UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
	};

	public Engine getEngine(); // engine getter

	public Vehicle.Colour getColour(); // colour getter

	public void paint(Vehicle.Colour colour); // paint a car

}
