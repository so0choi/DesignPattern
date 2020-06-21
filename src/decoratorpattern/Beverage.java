package decoratorpattern;

public abstract class Beverage {
	String description = null;
	Size beverageSize;

	enum Size {
		TALL, GRANDE, VENTI
	};

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public void setSize(String size) {
		if (size.equals("t")) {
			this.beverageSize = Size.TALL;
		} else if (size.equals("g")) {
			this.beverageSize = Size.GRANDE;
		} else if (size.equals("v")) {
			this.beverageSize = Size.VENTI;
		} else {
			System.out.println("Size error");
		}
	}

	public Size getSize() {
		return this.beverageSize;
	}
}
