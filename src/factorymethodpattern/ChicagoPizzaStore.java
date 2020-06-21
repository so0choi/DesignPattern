package factorymethodpattern;

public class ChicagoPizzaStore extends PizzaStore {
	Pizza pizza;

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		} else
			pizza = null;

		return pizza;
	}

}
