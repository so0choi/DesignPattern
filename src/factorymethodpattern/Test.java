package factorymethodpattern;

public class Test {

	public static void main(String[] args) {
		NYPizzaStore ny = new NYPizzaStore();
		ny.orderPizza("pepperoni");
		System.out.println();
		ChicagoPizzaStore ch = new ChicagoPizzaStore();
		ch.orderPizza("cheese");
	}

}
