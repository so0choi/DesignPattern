package factorymethodpattern;

public class NYPizzaStore extends PizzaStore {
	Pizza pizza;

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		} else
			pizza = null;

		return pizza;
	}

}
