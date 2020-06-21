package singletonpattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	private volatile static ChocolateBoiler uniqueBoiler;

	public static ChocolateBoiler getInstance() {
		if (uniqueBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				if (uniqueBoiler == null) {
					uniqueBoiler = new ChocolateBoiler();
				}
			}

		}
		return uniqueBoiler;

	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = true;
			System.out.println("fill chocolate");
		} else
			System.out.println("it's not empty.");
	}

	public boolean isEmpty() {
		return empty;
	}

	public void drain() {

		if (!isEmpty() && isBoiled()) {
			empty = true;
			System.out.println("drain chocolate");
		} else
			System.out.println("it's empty or it's not boiling");
	}

	public boolean isBoiled() {
		return boiled;
	}

}
