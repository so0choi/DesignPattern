package commandpattern;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (Command c : onCommands)
			c = noCommand;
		for (Command c : offCommands)
			c = noCommand;
	}

	Light ligt = new Light("living room");

}
