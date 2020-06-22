package observer_hw;

public class Test {
	public static void main(String[] args) {
//		SpeedMonitor monitor = new SpeedMonitor();
//		Speedometer speedo = new Speedometer();
//		speedo.addObserver(monitor);
		MySpeedMonitor monitor = new MySpeedMonitor();
		MySpeedometer speedo = new MySpeedometer();
		speedo.registerObserver(monitor);

		speedo.setCurrentSpeed(50);
		speedo.setCurrentSpeed(70);
		speedo.setCurrentSpeed(40);
		speedo.setCurrentSpeed(100);
		speedo.setCurrentSpeed(69);

	}
}
