package factorymethodpattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings;

	public Pizza() {
		toppings = new ArrayList<String>();
	}

	public void prepare() {
		System.out.println("preparing " + name + " pizza");
		System.out.println("tossing dough..");
		System.out.println("adding sauce");
		System.out.println("adding toppings: ");
		for (String topping : toppings) {
			System.out.println(topping + " ");
		}
	}

	public void bake() {
		System.out.println("baking pizza");
	};

	public void cut() {
		System.out.println("cutting pizza");
	}

	public void box() {
		System.out.println("putting pizza in a box");
	}

}
