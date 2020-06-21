package singletonpattern;

public class TestChocolate {
	public static void main(String[] srgc) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.drain();
	}
}
