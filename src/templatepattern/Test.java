package templatepattern;

public class Test {
	public static void main(String[] args) {
		CaffeineBeverage beverage = new Coffee();
		beverage.makeBeverage();

		System.out.println("Tea Ordered!");
		beverage = new Tea();
		beverage.makeBeverage();

	}
}
