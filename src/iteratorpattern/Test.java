package iteratorpattern;

public class Test {

	public static void main(String[] args) {
		PancakeHouseMenu p = new PancakeHouseMenu();
		DinerMenu m = new DinerMenu();
		Waitress waitress = new Waitress(p, m);
		waitress.printMenu();
	}

}
