package strategy_hw;

public class Test {
	public static void main(String[] args) {
		AbstractCar myCar = new Sport(new StandardEngine(2000));
		myCar.setSpeed(20);
		myCar.setSpeed(40);
		System.out.println("switching on sport mdoe gearbox");
		myCar.setGearboxStrategy(new SportGearboxStrategy());
		myCar.setSpeed(20);
		myCar.setSpeed(40);
	}
}
