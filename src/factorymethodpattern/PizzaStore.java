package factorymethodpattern;

public abstract class PizzaStore {
	public void orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	public abstract Pizza createPizza(String type);
}
