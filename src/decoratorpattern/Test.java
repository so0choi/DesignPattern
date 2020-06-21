package decoratorpattern;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Beverage b = new Espresso();
		System.out.println("How about size? tall/grande/venti (t/g/v)");
		Scanner sc = new Scanner(System.in);
		String bSize = sc.next();
		b.setSize(bSize);

		b = new Whip(b);

		b = new Whip(b);
		System.out.println(b.getDescription() + ", cost is " + b.cost());

		sc.close();
	}
}
