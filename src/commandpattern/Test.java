package commandpattern;

public class Test {
	public static void main(String[] args) {
		SimpleRemoteControl controller = new SimpleRemoteControl();
		Light light = new Light("living room");
		controller.setCommand(new LightOnCommand(light));
		controller.buttonPressed();
	}

}
