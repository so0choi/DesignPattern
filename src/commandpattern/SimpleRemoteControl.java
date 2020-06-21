package commandpattern;

public class SimpleRemoteControl {
	Command slot;

	public void setCommand(Command c) {
		slot = c;
	}

	public void buttonPressed() {
		slot.execute();
	}
}
