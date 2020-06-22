package compositepattern;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	double price;
	boolean vegetarian;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}

	public boolean isVegetarian() {
		return this.vegetarian;
	}

	@Override
	public void print() {
		System.out.println(" " + getName());
		if (isVegetarian())
			System.out.print("(v)");
		System.out.println(", " + getPrice());
		System.out.println("   -- " + getDescription());
	}
}
